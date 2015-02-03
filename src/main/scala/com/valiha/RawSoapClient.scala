package com.valiha

import scala.xml.{ Elem, XML }

class RawSoapClient {
  private def error(msg: String) = {
    println("SoapClient error: " + msg)
  }

  def wrap(xml: Elem): String = {
    val redefine = """
        "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n")
        """
    val soap =
      <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
        <SOAP-ENV:Body>
          { xml }
        </SOAP-ENV:Body>
      </SOAP-ENV:Envelope>
    soap.toString
  }

  def sendMessage(host: String, req: Elem): Option[Elem] = {
    val url = new java.net.URL(host)
    val outs = wrap(req).getBytes
    val conn = url.openConnection.asInstanceOf[java.net.HttpURLConnection]
    try {
      conn.setRequestMethod("POST")
      conn.setDoOutput(true)
      conn.setRequestProperty("Content-Length", outs.length.toString)
      conn.setRequestProperty("Content-Type", "text/xml")
      conn.getOutputStream.write(outs)
      conn.getOutputStream.close
      Some(XML.load(conn.getInputStream))
    } catch {
      case e: Exception =>
        error("post: " + e)
        error("post:" + scala.io.Source.fromInputStream(conn.getErrorStream).mkString)
        None
    }
  }
}

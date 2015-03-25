package com.valiha

import net.authorize.Service
import javax.xml.ws.WebServiceRef
import java.net.URL
import javax.xml.namespace.QName

class JaxWSClient(url: URL) {

  @WebServiceRef(wsdlLocation = "https://apitest.authorize.net/soap/v1/Service.asmx?WSDL")
  val authService = new Service(url,new QName("https://api.authorize.net/soap/v1/", "Service"))

  def isAlive: Option[String] = {
    val alive = authService.getServiceSoap.isAlive
    Some(alive.getResultCode.value)
  }

}

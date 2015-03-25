package com.valiha

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class AuthorizeTest_Spec extends FreeSpec {

  "Is Authorize.net Raw WS available? " - {

    val host = "https://apitest.authorize.net/soap/v1/Service.asmx"
    val req = <IsAlive xmlns="https://api.authorize.net/soap/v1/"/>
    val cli = new RawSoapClient
    println("##### request:\n" + cli.wrap(req))
    val resp = cli.sendMessage(host, req)
    assert(resp.isDefined)
    println("##### response:\n" + resp.get.toString())
    assert(List("Ok") == (resp.get \\ "resultCode").map(_.text))

  }

  "Is Authorize.net JAX-WS available? " - {

  //val host = "http://localhost:80/soap/v1/Service.asmx?WSDL"
  val host = "https://apitest.authorize.net/soap/v1/Service.asmx?WSDL"

    val client = new JaxWSClient(new java.net.URL(host))
    assert(client.isAlive.get == "Ok")

  }

}

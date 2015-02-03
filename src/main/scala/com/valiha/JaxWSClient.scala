package com.valiha

import net.authorize.Service
import javax.xml.ws.WebServiceRef
import javax.xml.ws.WebServiceClient

class JaxWSClient {

  @WebServiceRef(wsdlLocation = "https://apitest.authorize.net/soap/v1/Service.asmx?WSDL")
  val authService = new Service

  def isAlive: Option[String] = {
    val alive = authService.getServiceSoap.isAlive
    Some(alive.getResultCode.value)
  }

}
package com.valiha

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SoapTest_Spec extends FreeSpec {

  "Is Authorize.net WS available? " - {

    val host = "https://apitest.authorize.net/soap/v1/Service.asmx"
    val req = <IsAlive xmlns="https://api.authorize.net/soap/v1/"/>
    val cli = new RawSoapClient
    println("##### request:\n" + cli.wrap(req))
    val resp = cli.sendMessage(host, req)
    assert(resp.isDefined)
    println("##### response:\n" + resp.get.toString())
    assert(List("Ok") == (resp.get \\ "resultCode").map(_.text))

  }

  "What's the weather in Lewiston? " - {

    val host = "http://ws.cdyne.com/WeatherWS/Weather.asmx"
    val req = <GetCityForecastByZIP xmlns="http://ws.cdyne.com/WeatherWS/"><ZIP>14092</ZIP></GetCityForecastByZIP>;
    val cli = new RawSoapClient
    println("##### request:\n" + cli.wrap(req))
    //--TBD Get rid of the Exception
    intercept[NullPointerException] {
      val resp = cli.sendMessage(host, req)
    }

  }
}
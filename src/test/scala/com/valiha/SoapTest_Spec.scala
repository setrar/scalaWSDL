package com.valiha

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SoapTest_Spec extends FreeSpec {

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
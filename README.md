scalaWSDL
=========

A simple scala SOAP client accessing Authorize.net WebServices:

* A raw SOAP Client testing if the service is alive 
* A JAX-WS Client doing the exact same thing

JAX-WS Stub Generation
----------------------

> wsimport -keep https://apitest.authorize.net/soap/v1/Service.asmx?WSDL  -d src/main/java -p net.authorize

Coding
------

* Generate Eclipse Artifacts

> sbt eclipse


Testing
-------

> sbt test

- Other solution using http://scalaxb.org
-----------------------------------------

Note: This is not yet implemented ( experimental )


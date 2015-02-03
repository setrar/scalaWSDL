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

Known Issues
------------

* on MacOS downgrade your JDK version to 1.6 if issues with JAXWS version below

Caused by: java.util.MissingResourceException: \
Can't find com.sun.xml.internal.messaging.saaj.soap.LocalStrings bundle

in ~/.bash_profile<br>
 # JAVA_HOME<br>
 #export JAVA_VERSION=1.8<br>
 #export JAVA_VERSION=1.7<br>
 export JAVA_VERSION=1.6<br>
 export JAVA_HOME=$(/usr/libexec/java_home -v ${JAVA_VERSION})<br>

- Other solution using http://scalaxb.org
-----------------------------------------

Note: This is not yet implemented ( experimental )


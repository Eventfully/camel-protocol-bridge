# A simple Camel protocol bridge
An simple example of a production quality protocol bridge using Apache Camel

## Supported protocols
-  Websphere MQ
-  File

## Add or remove a protocol

Just add or remove a camel component dependency in build.gradle
Look at how WmqConfiguration together with the application.properties are done if you need to do some Spring bean configuration,

### Add rabbitmq
`compile "org.apache.camel:camel-rabbitmq:$camelVersion"`
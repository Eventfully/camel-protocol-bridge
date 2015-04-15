package org.eventfully.camel.bridge.route

import org.apache.camel.LoggingLevel
import org.apache.camel.builder.RouteBuilder
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "mainRoute")
class ProtocolBridgeRoute extends RouteBuilder {


    @Override
    public void configure() throws Exception {

        from("{{mainRoute.from}}")
                .routeId("{{mainRoute.id}}")
                .autoStartup("{{mainRoute.enabled}}")
                .log(LoggingLevel.INFO, "Message received.")
                .to("{{mainRoute.to}}")

    }

}

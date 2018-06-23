package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@EnableConfigurationProperties
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringApplication.class);

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(Application.class);
        Environment env = app.run().getEnvironment();
        LOGGER.info("The Application start now!Come ON,Partner!!!!");
        LOGGER.info("Access URLs:\n----------------------------------------------------------\n\t" +
                        "Local: \t\thttp://127.0.0.1:{}\n\t" +
                        "External: \thttp://{}:{}\n----------------------------------------------------------",
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));
    }
}

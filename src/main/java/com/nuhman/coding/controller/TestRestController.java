package com.nuhman.coding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class TestRestController {

    @Autowired
    Environment environment;

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping(path = "/")
    public String getServerInfo(){
        String osName = System.getProperty("os.name");
        String osArch = System.getProperty("os.arch");
        Environment env = applicationContext.getBean(Environment.class);
        //.getProperty("server.port", Integer.class, 8080);

        try {
            System.out.println(InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        System.out.println(environment.getProperty("server.port"));
        return "test";
    }
}

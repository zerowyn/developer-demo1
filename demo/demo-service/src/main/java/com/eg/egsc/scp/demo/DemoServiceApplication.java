/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.eg.egsc.scp.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.eg.egsc.framework.service.core.ApplicationStarter;

@SpringBootApplication
//@EnableEurekaClient
@ComponentScan(basePackages = {"com.eg.egsc"})
@MapperScan(basePackages = {"com.eg.egsc.scp.demo"})
public class DemoServiceApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoServiceApplication.class);
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        new ApplicationStarter().run(DemoServiceApplication.class, args);
    }
}

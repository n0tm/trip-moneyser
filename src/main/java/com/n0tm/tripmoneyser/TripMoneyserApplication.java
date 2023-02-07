package com.n0tm.tripmoneyser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TripMoneyserApplication {

    public static void main(String[] args) {
        SpringApplication.run(TripMoneyserApplication.class, args);
    }
}

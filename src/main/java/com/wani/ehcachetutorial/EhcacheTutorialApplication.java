package com.wani.ehcachetutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EhcacheTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(EhcacheTutorialApplication.class, args);
    }

}

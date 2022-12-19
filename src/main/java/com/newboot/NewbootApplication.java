package com.newboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author HAO
 */
@SpringBootApplication
@MapperScan("com.newboot.dao.mapper")
@EnableCaching
public class NewbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewbootApplication.class, args);
    }

}

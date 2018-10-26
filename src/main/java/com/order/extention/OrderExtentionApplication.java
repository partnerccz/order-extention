package com.order.extention;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.order.extention.dao")
@EnableSwagger2
public class OrderExtentionApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderExtentionApplication.class, args);
    }
}

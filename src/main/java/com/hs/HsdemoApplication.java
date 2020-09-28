package com.hs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan({"com.hs.Mapper"})
@ComponentScan({"com.hs.controller","com.hs.bean","com.hs.bean"})
public class HsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HsdemoApplication.class, args);
    }

}

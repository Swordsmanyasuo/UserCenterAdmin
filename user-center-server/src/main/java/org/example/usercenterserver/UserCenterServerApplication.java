package org.example.usercenterserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.usercenterserver.mapper")
public class UserCenterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterServerApplication.class, args);
    }

}

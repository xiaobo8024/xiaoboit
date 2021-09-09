package com.xiaoboit;

import com.xiaoboit.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserSpringBoot {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(UserSpringBoot.class, args);
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
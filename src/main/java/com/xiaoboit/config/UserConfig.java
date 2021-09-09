package com.xiaoboit.config;

import com.xiaoboit.condition.ConditionalOnClass;
import com.xiaoboit.condition.MyCondition;
import com.xiaoboit.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
//    @Conditional(value ={MyCondition.class})
    @ConditionalOnClass(name = "redis.clients.jedis.Jedis")
    public User user(){

        return new User();
    }
}
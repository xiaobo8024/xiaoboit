package com.xiaoboit.condition;

import com.xiaoboit.config.UserConfig;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import redis.clients.jedis.Jedis;

import java.util.Map;

public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        try {
            Map<String, Object> map = metadata.getAnnotationAttributes(ConditionalOnClass.class.getName());

            String[] names = (String[]) map.get("name");
            for (String name : names) {
                System.out.println("name="+name);
                Class.forName(name);
            }
               return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
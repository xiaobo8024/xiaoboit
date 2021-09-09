package com.xiaoboit.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Conditional(value = {MyCondition.class})
public @interface ConditionalOnClass {
    String[] name();
}

package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: testAnnotation
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月16日 8:35
 * @Version: 1.0
 **/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface testAnnotation {

}

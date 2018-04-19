package cn.a52going.codejava.annotation;

import java.lang.annotation.*;

/**
 *@ClassName: MyMessage
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/19 11:21
 **/

@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface MyMessage {
    String name() default "sam";

    int num() default 0;

    String desc();
}

package cn.a52going.codespring.annotationUtils;

import java.lang.annotation.*;

/**
 *@ClassName: Column
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/19 16:22
 **/

@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    public String desc();
    public String[] allowedValues() default {};
    public String defaultValue() default "";
}

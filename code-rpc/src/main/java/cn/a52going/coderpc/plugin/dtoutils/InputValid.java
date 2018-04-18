package cn.a52going.coderpc.plugin.dtoutils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InputValid {
    String label() default "";

    String descri() default "";

    boolean notEmpty() default false;

    String emptyErr() default "";

    String typeErr() default "数据类型不匹配";

    int maxLength() default 0;

    int minLength() default 0;

    int mustLength() default 0;

    ValidType validType() default ValidType.none;

    int decimalLen() default 0;

    String max() default "";

    String min() default "";

    String constValue() default "";

    InputType inputType() default InputType.text;

    String[] inputValues() default {};

    String defaultValue() default "";

    int scale() default -1;
}

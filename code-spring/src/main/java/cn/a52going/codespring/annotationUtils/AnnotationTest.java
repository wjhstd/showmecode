package cn.a52going.codespring.annotationUtils;

import org.junit.Test;
import org.springframework.core.annotation.AnnotationUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 *@ClassName: AnnotationTest
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/19 16:27
 **/


public class AnnotationTest {
    @Test
    public void test(){
        Field[] fields = TracelModel.class.getDeclaredFields();
        for (Field f:fields) {
            Annotation[] annotations = f.getDeclaredAnnotations();
            for (Annotation a : annotations) {
                if (a instanceof  Column){
                    Map map = AnnotationUtils.getAnnotationAttributes(a);
                    System.out.println(map);
                }
            }

        }
        
    }
}

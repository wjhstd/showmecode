package cn.a52going.codespring.classUtils;

import org.junit.Test;
import org.springframework.util.ClassUtils;

/**
 *@ClassName: ClassTest
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/19 17:04
 **/


public class ClassTest {
   @Test
    public void test(){
       System.out.println(ClassUtils.getQualifiedName(this.getClass()));;
    }
}

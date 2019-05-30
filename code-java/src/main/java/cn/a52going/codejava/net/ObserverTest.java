package cn.a52going.codejava.net;
/**
 *@ClassName: ObserverTest
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/16 16:41
 **/


public class ObserverTest {
   public static void main(String arg[]){
       Teacher t = new Teacher();
       Student s = new Student(t,"wjh");
       Student s2 = new Student(t,"lili");
       t.setWork("抄书一百遍!!!");
       System.out.println(t.countObservers());
   }

}

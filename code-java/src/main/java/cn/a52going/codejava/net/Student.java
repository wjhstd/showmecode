package cn.a52going.codejava.net;

import java.util.Observable;
import java.util.Observer;

/**
 *@ClassName: Student
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/16 16:37
 **/


public class Student implements Observer {

    private Observable observable;
    private String name;

    public Student(Observable observable, String name) {
        this.observable = observable;
        this.name = name;
        observable.addObserver(this);
    }


    public void update(Observable o, Object arg) {
        System.out.println(arg);
        Teacher t = (Teacher) o;
        System.out.println(name+"分到的作业是:"+t.getInfo());


    }
}

package com.a52going.codenetwork.observer;


import java.util.Observable;

/**
 *@ClassName: Teacher
 *@description: 观察者模式
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/16 16:15
 **/


public class Teacher extends Observable {
    /**
     * 信息字段
     */
    private String info;
    public void setWork(String info){
        this.info = info;
        System.out.println("布置的作业是："+info);
        setChanged();
        notifyObservers(info);
    }
    public String getInfo(){
        return info;
    }
}

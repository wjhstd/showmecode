package com.ityousee.model;

import java.util.List;
/**
 *@ClassName: Department
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/5/11 13:49
 **/


public class Department {
    private int department_id;
    private String department_name;
    private List<User> users;

    public Department() {
        super();
    }

    public Department(int department_id, String department_name,
                      List<User> users) {
        super();
        this.department_id = department_id;
        this.department_name = department_name;
        this.users = users;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Department [department_id=" + department_id
                + ", department_name=" + department_name + ", users=" + users
                + "]"+"\n";
    }
}
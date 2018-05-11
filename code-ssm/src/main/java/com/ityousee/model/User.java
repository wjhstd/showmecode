package com.ityousee.model;

import javax.management.relation.Role;
import java.util.Date;
import java.util.List;
/**
 *@ClassName: User
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/5/11 13:49
 **/


public class User {
    private int user_id;
    private String user_name;
    private String user_gender;
    private String user_email;
    private String user_phone;
    private String user_address;
    private Date user_birthday;
    private int department_id;

    private List<Role> roles;

    private Department department;

    public User() {
        super();
    }

    public User(String user_name, String user_gender,
                String user_email, String user_phone, String user_address,
                Date user_birthday, int department_id) {
        super();
        this.user_name = user_name;
        this.user_gender = user_gender;
        this.user_email = user_email;
        this.user_phone = user_phone;
        this.user_address = user_address;
        this.user_birthday = user_birthday;
        this.department_id = department_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public Date getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User [user_id=" + user_id + ", user_name=" + user_name
                + ", user_gender=" + user_gender + ", user_email=" + user_email
                + ", user_phone=" + user_phone + ", user_address="
                + user_address + ", user_birthday=" + user_birthday
                + ", department_id=" + department_id + ", roles=" + roles
                + ", department=" + department + "]\n";
    }
}
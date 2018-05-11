package com.ityousee.model;

import java.util.List;
/**
 *@ClassName: Role
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/5/11 13:50
 **/

public class Role {
    private int role_id;
    private String role_name;
    private List<User> users;

    public Role() {

    }

    public Role(int role_id, String role_name) {
        super();
        this.role_id = role_id;
        this.role_name = role_name;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role [role_id=" + role_id + ", role_name=" + role_name
                + ", users=" + users + "]";
    }

}
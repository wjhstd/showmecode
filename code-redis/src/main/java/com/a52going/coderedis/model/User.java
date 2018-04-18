package com.a52going.coderedis.model;

import java.io.Serializable;

/**
 * @author wangjunhui
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @email wangjunhui@wondersgroup.com
 * @date 2018/3/2417:40
 */
public class User implements Serializable {
    private static final long serialVersionUId = 1L;

    private String id;
    private String name;

    public User(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

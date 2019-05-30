package cn.a52going.codejava.apache;

/**
 *@ClassName: Bar
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/19 10:46
 **/


public class Bar {
    private int id;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}

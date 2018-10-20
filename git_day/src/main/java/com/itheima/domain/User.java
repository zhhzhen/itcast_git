package com.itheima.domain;

/**
 * Created with IntelliJ IDEA
 * User:画船听雨眠
 * Date:2018/10/20
 * Time:17:16
 */
public class User{
    private Integer id;
    private  String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

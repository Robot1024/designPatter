package com.penglei.Filter;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Person
 * @Description TODO
 * @date 2020-05-09 19:36
 */
// 过滤器模式几乎不用，都有数据库存储了，还用啥过滤器
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
}
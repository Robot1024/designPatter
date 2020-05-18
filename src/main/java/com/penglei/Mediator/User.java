package com.penglei.Mediator;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName User
 * @Description TODO
 * @date 2020-05-10 01:27
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
package com.penglei.Memento;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Memento
 * @Description TODO
 * @date 2020-05-10 01:48
 */
// 记忆碎片 , 存储对象状态的
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
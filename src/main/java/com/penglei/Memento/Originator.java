package com.penglei.Memento;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Originator
 * @Description TODO
 * @date 2020-05-10 01:49
 */
// 当前对象
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
    // 保存当前状态进去记忆
    public Memento saveStateToMemento(){
        return new Memento(state);
    }
    // 获取记忆里的状态
    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
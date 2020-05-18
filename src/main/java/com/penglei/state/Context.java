package com.penglei.state;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Context
 * @Description TODO
 * @date 2020-05-10 02:48
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
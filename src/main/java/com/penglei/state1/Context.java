package com.penglei.state1;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Context
 * @Description TODO
 * @date 2020-05-12 18:18
 */
public class Context {
    public static State STATE_A;
    public static State STATE_B;
    private State currentSate;

    public Context() {
        STATE_A = new ConcreteStateA(this);
        STATE_B = new ConcreteStateB(this);
    }

    public void setCurrentSate(State currentSate) {
        this.currentSate = currentSate;
    }

    public void handle1(){
        this.currentSate.handle1();
    }

    public void handle2(){
        this.currentSate.handle2();
    }

}
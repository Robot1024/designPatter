package com.penglei.state;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName StopState
 * @Description TODO
 * @date 2020-05-10 02:48
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
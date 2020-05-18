package com.penglei.state;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName StartState
 * @Description TODO
 * @date 2020-05-10 02:48
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
package com.penglei.state;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName StatePatternDemo
 * @Description TODO
 * @date 2020-05-10 02:49
 */
public class StatePatternDemo {

    public static void main(String[] args) {

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
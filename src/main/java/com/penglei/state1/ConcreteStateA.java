package com.penglei.state1;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ConcreteStateA
 * @Description TODO
 * @date 2020-05-12 18:17
 */
public class ConcreteStateA implements State {
    private Context context;

    public ConcreteStateA(Context context) {
        this.context = context;
    }

    @Override
    public void handle1() {
        //当前状态下handle1行为的处理
        //...
        System.out.printf("A - handle1");
    }

    @Override
    public void handle2() {
        //当前状态下handle2行为的处理
        //...
        System.out.println("A - handle2");
        this.context.setCurrentSate(Context.STATE_B);
    }
}
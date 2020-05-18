package com.penglei.decorator;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Concrete1Decorator
 * @Description TODO
 * @date 2020-05-09 14:41
 */
public class Concrete1Decorator extends Decorator{

    public Concrete1Decorator(Component component){
        super(component);
    }

    // 定义自己的修饰逻辑
    private void decorateMethod(){
        // do somethind ...
        // 添加装饰对象，装饰功能
        System.out.println("加烤肠，加2块");
    }

    // 重写父类的方法
    public void cost(){
        this.decorateMethod();
        super.cost();
    }
}
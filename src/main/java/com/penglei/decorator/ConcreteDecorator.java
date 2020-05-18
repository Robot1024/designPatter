package com.penglei.decorator;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ConcreteDecorator
 * @Description TODO
 * @date 2020-05-09 14:33
 */
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component){
        super(component);
    }

    // 定义自己的修饰逻辑
    private void decorateMethod(){
        // do somethind ...
        // 添加装饰对象，装饰功能
        System.out.println("加鸡蛋，加1块");
    }

    // 重写父类的方法
    public void cost(){
        // 执行自己装饰方法
        this.decorateMethod();
        // 调用被传入的 被装饰对象的 cost
        super.cost();
    }
}
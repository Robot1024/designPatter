package com.penglei.decorator;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName DecoratorDemo
 * @Description TODO
 * @date 2020-05-09 14:33
 */
public class DecoratorDemo{
    public static void main(String[] args){
        // 这是原始的肉夹馍
        Component component = new ConcreteComponent();
        // 第一次修饰，比如，加鸡蛋，加1块
        component.cost();
        // 生产装饰后的肉夹馍，将原始肉夹馍传入进去
        component = new ConcreteDecorator(component);
        component.cost();
        // 第二次修饰，比如，加烤肠，加2块
        // 这次是装饰 ，已经加了鸡蛋肉夹馍了。
        component = new Concrete1Decorator(component);
        // 修饰后运行，将钱加在一起
        component.cost();


        // 上面的写法很不容理解，修改成下面写法
        Component component1 = new ConcreteComponent();

        ConcreteDecorator cd = new ConcreteDecorator(component1);

        Concrete1Decorator cd1 = new Concrete1Decorator(cd);

        cd1.cost();



    }
}
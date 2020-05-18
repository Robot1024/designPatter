package com.penglei.decorator;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Decorator
 * @Description TODO
 * @date 2020-05-09 14:32
 */
// 装饰类抽象类
public abstract class Decorator extends Component{
    // 持有被装饰对象
    private Component component = null;
    // 构造器要初始化被装饰对象
    public Decorator(Component component){
        this.component = component;
    }

    // 调用被装饰对象的 cost,相当于隐藏效果
    // 这个cost 是相当于，调用被传入被装饰对象。
    @Override
    public void cost(){
        if(component != null){
            this.component.cost();
        }
    }
}
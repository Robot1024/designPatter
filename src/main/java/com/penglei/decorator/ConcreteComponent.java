package com.penglei.decorator;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ConcreteComponent
 * @Description TODO
 * @date 2020-05-09 14:31
 */
public class ConcreteComponent extends Component{


    @Override
    public void cost(){
        // do something ...
        System.out.println("肉夹馍5元一个");
    }
}
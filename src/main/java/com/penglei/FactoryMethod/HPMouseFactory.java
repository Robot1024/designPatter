package com.penglei.FactoryMethod;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName HPMouseFactory
 * @Description 惠普鼠标工厂
 * @date 2020-04-27 12:29
 */
public class HPMouseFactory implements Factory {

    public IMouse GetMouseFactory() {
        return new HPMouse();
    }

}

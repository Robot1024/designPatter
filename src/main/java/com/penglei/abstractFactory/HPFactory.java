package com.penglei.abstractFactory;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName HPFactory
 * @Description 惠普工厂
 * @date 2020-04-27 13:30
 */
public class HPFactory implements Factory {

    public Ikeyboard GetKeyboardProduct() {

        return new HPkeyboard();
    }

    public IMouse GetMouseProduct() {
        return new HPMouse();
    }
}
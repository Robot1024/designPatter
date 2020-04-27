package com.penglei.abstractFactory;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName LenoveFactory
 * @Description 联想工厂生产联想产品，感动好以后还能生产联想电脑呢
 * @date 2020-04-27 13:28
 */
public class LenoveFactory implements Factory {

    public IMouse GetMouseProduct() {
        return new LenoveMouser();
    }

    public Ikeyboard GetKeyboardProduct() {
        return new LenoveKeyboard();
    }
}

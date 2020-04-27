package com.penglei.FactoryMethod;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName LenoveMouseFactory
 * @Description 联想鼠标工厂
 * @date 2020-04-27 12:31
 */
public class LenoveMouseFactory implements Factory{

    public IMouse GetMouseFactory() {

        return new LenoveMouser();
    }
}

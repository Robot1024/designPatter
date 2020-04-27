package com.penglei.staticFactory;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName MouseFactory
 * @Description 多方法静态简单工厂
 * @date 2020-04-27 12:16
 */
public class MouseFactory
{

    public static IMouse GetHPMouse()
    {
        return new HPMouse();
    }

    public static IMouse GetLenoveMouser()
    {
        return new LenoveMouser();
    }

}
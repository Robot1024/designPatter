package com.penglei.multiMethodFactory;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName MouseFactory
 * @Description 多方法简单工厂
 * @date 2020-04-27 12:16
 */
public class MouseFactory
{

    public IMouse GetHPMouse()
    {
        return new HPMouse();
    }

    public IMouse GetLenoveMouser()
    {
        return new LenoveMouser();
    }

}
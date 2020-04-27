package com.penglei.simpleFactory;

import java.io.Console;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName MouseFactory
 * @Description 鼠标工厂,根据客户端不同参数，生产不同的产品
 * @date 2020-04-27 12:01
 */
public  class MouseFactory
{
    /// <param name="type">0 代码惠普鼠标 1 代码联想鼠标</param>
    /// <returns></returns>
    public IMouse GetMouse(int type)
    {
        if (type == 0)
        {
            return new HPMouse();
        }
        else if (type == 1)
        {
            return new LenoveMouser();
        }
        else {

            System.out.println("请输入正确类型！");
            return null;
        }
    }
}

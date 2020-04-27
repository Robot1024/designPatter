package com.penglei.staticFactory;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TestFactory
 * @Description 测试多方法简单工厂
 * @date 2020-04-27 12:17
 */
public class TestFactory {

    public static void main(String[] args) {

        String mouseInfo1 = MouseFactory.GetHPMouse().GetMouseInfo();
        //输出惠普鼠标品牌
        System.out.println(mouseInfo1);
        String mouseInfo2 = MouseFactory.GetLenoveMouser().GetMouseInfo();
        //输出联想鼠标品牌
        System.out.println(mouseInfo2);
    }
}

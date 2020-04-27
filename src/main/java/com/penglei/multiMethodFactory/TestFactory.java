package com.penglei.multiMethodFactory;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TestFactory
 * @Description 测试多方法简单工厂
 * @date 2020-04-27 12:17
 */
public class TestFactory {

    public static void main(String[] args) {
        MouseFactory mouseFactory = new MouseFactory();
        String mouseInfo1 = mouseFactory.GetHPMouse().GetMouseInfo();
        //输出惠普鼠标品牌
        System.out.println(mouseInfo1);
        String mouseInfo2 = mouseFactory.GetLenoveMouser().GetMouseInfo();
        //输出联想鼠标品牌
        System.out.println(mouseInfo2);
    }
}

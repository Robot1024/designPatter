package com.penglei.FactoryMethod;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TestFactoryMethod
 * @Description 测试类
 * @date 2020-04-27 12:35
 */
public class TestFactoryMethod {

    public static void main(String[] args) {

        Factory factory = new HPMouseFactory();
        String mouseInfo1 = factory.GetMouseFactory().GetMouseInfo();
        //输出惠普鼠标品牌
        System.out.println(mouseInfo1);
        //实例化联想鼠标工厂
        Factory factory2 = new LenoveMouseFactory();
        String mouseInfo2 = factory2.GetMouseFactory().GetMouseInfo();
        //输出联想鼠标品牌
        System.out.println(mouseInfo2);

    }
}

package com.penglei.simpleFactory;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TestFactory
 * @Description 客户端测试
 * @date 2020-04-27 12:04
 */
public class TestFactory {

    public static void main(String[] args) {

        MouseFactory mouseFactory = new MouseFactory();
        String mouseInfo1 = mouseFactory.GetMouse(0).GetMouseInfo();
        System.out.println(mouseInfo1);
        // 输出：惠普品牌鼠标
        String mouseInfo2 = mouseFactory.GetMouse(1).GetMouseInfo();
        System.out.println(mouseInfo2);
        //输出：联想品牌鼠标


    }
}

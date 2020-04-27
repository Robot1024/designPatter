package com.penglei.abstractFactory;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TestAbstractFactory
 * @Description TODO
 * @date 2020-04-27 13:33
 */
public class TestAbstractFactory {

    public static void main(String[] args) {
        //实例化惠普鼠标工厂
        Factory HPfactory = new HPFactory();
        String HPmouseInfo = HPfactory.GetMouseProduct().GetMouseInfo();
        String HPkeyboard = HPfactory.GetKeyboardProduct().GetKeyboardInfo();

        //输出惠普鼠标品牌
        System.out.println(HPmouseInfo);
        //输出惠普键盘
        System.out.println(HPkeyboard);
        //实例化联想鼠标工厂
        Factory Lfactory = new LenoveFactory();
        String LmouseInfo = Lfactory.GetMouseProduct().GetMouseInfo();
        String Lkeyboard = Lfactory.GetKeyboardProduct().GetKeyboardInfo();

        //输出联想鼠标品牌
        System.out.println(LmouseInfo);
        System.out.println(Lkeyboard);

    }
}

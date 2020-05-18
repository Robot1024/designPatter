package com.penglei.composite;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020-05-09 00:40
 */
public class Client {

    public static void main(String[] args) {


        // 组合模式主要模拟树形结构，与其所是设计模式还不如说是，数据模式。
        // 这个可以有更多变形，透明模式或安全模式
        Composite root = new Composite("根节点");

        Composite composite1 = new Composite("组件1");
        Leaf leaf1 = new Leaf("叶子1");
        Leaf leaf2 = new Leaf("叶子2");



        root.addComposite(composite1);
        root.addComposite(leaf1);
        root.addComposite(leaf2);

        Leaf leaf3 = new Leaf("叶3");

        composite1.addComposite(leaf3);



        root.operation();

    }
}
package com.penglei.Visitor;

import java.util.Random;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Manager
 * @Description TODO
 * @date 2020-05-12 19:38
 */
// 经理
public class Manager extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 一年做的产品数量
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
package com.penglei.Visitor;

import java.util.Random;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Engineer
 * @Description TODO
 * @date 2020-05-12 19:37
 */
// 工程师
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 工程师一年的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
package com.penglei.Visitor;

import java.util.Random;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Staff
 * @Description TODO
 * @date 2020-05-12 19:37
 */
// 员工基类
public abstract class Staff {

    public String name;
    public int kpi;// 员工KPI

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }
    // 核心方法，接受Visitor的访问
    public abstract void accept(Visitor visitor);
}
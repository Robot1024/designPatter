package com.penglei.Visitor;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Visitor
 * @Description TODO
 * @date 2020-05-12 19:38
 */
public interface Visitor {

    // 访问工程师类型
    void visit(Engineer engineer);

    // 访问经理类型
    void visit(Manager manager);
}
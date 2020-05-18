package com.penglei.Interpreter;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Expression
 * @Description TODO
 * @date 2020-05-09 21:48
 */
public interface Expression {
    // interpret 解释器接口
    public boolean interpret(String context);
}
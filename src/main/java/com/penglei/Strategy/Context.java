package com.penglei.Strategy;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Context
 * @Description TODO
 * @date 2020-05-12 19:23
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
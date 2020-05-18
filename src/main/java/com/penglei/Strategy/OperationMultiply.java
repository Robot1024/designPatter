package com.penglei.Strategy;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName OperationMultiply
 * @Description TODO
 * @date 2020-05-12 19:23
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
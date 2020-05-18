package com.penglei.Interpreter;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TerminalExpression
 * @Description TODO
 * @date 2020-05-09 21:49
 */
// 接口的实现类
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
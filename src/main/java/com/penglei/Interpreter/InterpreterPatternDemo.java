package com.penglei.Interpreter;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName InterpreterPatternDemo
 * @Description TODO
 * @date 2020-05-09 21:50
 */
public class InterpreterPatternDemo {

    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("John is male? " + isMale.interpret("Robert"));
        System.out.println("John is male? " + isMale.interpret("Robert John"));
        System.out.println("John is male? " + isMale.interpret("Robert Julie"));

        System.out.println("John is male? " + isMale.interpret("Julie"));
        //------------------------------------------------------------------------
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married"));

        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Julie"));
        // 同时为true 才能是ture
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married John"));
    }
}
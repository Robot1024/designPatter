package com.penglei.template;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TemplatePatternDemo
 * @Description TODO
 * @date 2020-05-09 01:46
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
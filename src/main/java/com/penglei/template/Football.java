package com.penglei.template;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Football
 * @Description TODO
 * @date 2020-05-09 01:45
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
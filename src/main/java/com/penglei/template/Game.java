package com.penglei.template;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Game
 * @Description TODO
 * @date 2020-05-09 01:44
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
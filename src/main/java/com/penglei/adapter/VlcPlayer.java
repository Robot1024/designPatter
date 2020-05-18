package com.penglei.adapter;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName VlcPlayer
 * @Description TODO
 * @date 2020-05-09 02:20
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
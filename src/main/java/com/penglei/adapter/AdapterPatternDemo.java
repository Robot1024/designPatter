package com.penglei.adapter;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName AdapterPatternDemo
 * @Description TODO
 * @date 2020-05-09 02:22
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
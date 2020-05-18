package com.penglei.state2;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020-05-12 18:24
 */
public class Client {
    static String state;
    public static void main(String[] args) {
        Bus bus = new Bus();
        if (state.equals("开门停止")) {
            bus.pickUpPassenger();
            bus.dropOffPassenger();
            bus.closeDoor();
        } else if (state.equals("开门运行")) {
            bus.closeDoor();
            bus.stop();
        } else if (state.equals("关门停止")) {
            bus.openDoor();
            bus.run();
        } else if (state.equals("关门运行")) {
            bus.stop();
        }
    }
}
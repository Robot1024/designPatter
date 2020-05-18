package com.penglei.state3;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020-05-12 18:32
 */
public class Client {

    public static void main(String[] args) {
        Bus bus = new Bus();
        //设置初始状态为关门运行状态
        BusState initState = new ClosedRunningState(bus);
        bus.setCurrentState(initState);

        //测试正常情况：停车->开门->下车->上车->关门->行驶
        bus.pickUpPassenger();
        bus.stop();
        bus.openDoor();
        bus.dropOffPassenger();
        bus.pickUpPassenger();
        bus.closeDoor();
        bus.run();

        //测试非正常情况1：关门行驶的时候去开门
        bus.setCurrentState(initState);
        bus.openDoor();

        //测试非正常情况2：门未关上就开始行驶
        bus.setCurrentState(new OpenedStoppedState(bus));
        bus.run();
    }
}
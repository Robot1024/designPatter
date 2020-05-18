package com.penglei.state3;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName OpenedStoppedState
 * @Description TODO
 * @date 2020-05-12 18:28
 */
public class OpenedStoppedState extends BusState {

    public OpenedStoppedState(Bus bus) {
        super(bus);
    }

    @Override
    public void openDoor() {
        //啥都不做，因为已经是开门状态下了不用再开门了
    }

    @Override
    public void closeDoor() {
        System.out.println("巴士关门了");
        //关门之后，巴士应该变成关门停止状态
        this.bus.setCurrentState(Bus.CLOSED_STOPPED_STATE);
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("开门停止状态下禁止行驶");
    }

    @Override
    public void stop() {
        //啥都不做，因为已经是停止状态下了不用再停止了
    }

    @Override
    public void pickUpPassenger() {
        System.out.println("乘客上车");
    }

    @Override
    public void dropOffPassenger() {
        System.out.println("乘客下车");
    }
}
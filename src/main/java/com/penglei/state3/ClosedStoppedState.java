package com.penglei.state3;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ClosedStoppedState
 * @Description TODO
 * @date 2020-05-12 18:30
 */
/**
 * 关门停止状态
 */
public class ClosedStoppedState extends BusState {

    public ClosedStoppedState(Bus bus) {
        super(bus);
    }

    @Override
    public void openDoor() {
        System.out.println("巴士开门了");
        //开门后，巴士变成开门停止状态
        this.bus.setCurrentState(Bus.OPENED_STOPPED_STATE);
    }

    @Override
    public void closeDoor() {
        //do nothing 已经是关门状态了
    }

    @Override
    public void run() {
        System.out.println("巴士开始行驶");
        //行驶后，巴士变成关门运行状态
        this.bus.setCurrentState(Bus.CLOSED_RUNNING_STATE);
    }

    @Override
    public void stop() {
        //do nothing 已经是停止状态了
    }

    @Override
    public void pickUpPassenger() {
        throw new UnsupportedOperationException("关门停止状态禁止乘客上车");
    }

    @Override
    public void dropOffPassenger() {
        throw new UnsupportedOperationException("关门停止状态禁止乘客下车");
    }
}
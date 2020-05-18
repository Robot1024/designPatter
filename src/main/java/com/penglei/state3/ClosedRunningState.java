package com.penglei.state3;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ClosedRunningState
 * @Description TODO
 * @date 2020-05-12 18:31
 */
/**
 * 关门运行状态
 */
public class ClosedRunningState extends BusState {

    public ClosedRunningState(Bus bus) {
        super(bus);
    }

    @Override
    public void openDoor() {
        throw new UnsupportedOperationException("关门运行状态禁止开门");
    }

    @Override
    public void closeDoor() {
        //do nothing 已经是关门状态了
    }

    @Override
    public void run() {
        //do nothing 已经是运行状态了
    }

    @Override
    public void stop() {
        System.out.println("巴士停车了");
        //停车后，巴士变成关门停止状态
        this.bus.setCurrentState(Bus.CLOSED_STOPPED_STATE);
    }

    @Override
    public void pickUpPassenger() {
        throw new UnsupportedOperationException("关门运行状态禁止乘客上车");
    }

    @Override
    public void dropOffPassenger() {
        throw new UnsupportedOperationException("关门运行状态禁止乘客下车");
    }
}
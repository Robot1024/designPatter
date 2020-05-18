package com.penglei.state3;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName OpenedRunningState
 * @Description TODO
 * @date 2020-05-12 18:30
 */
public class OpenedRunningState extends BusState {

    public OpenedRunningState(Bus bus) {
        super(bus);
    }

    @Override
    public void openDoor() {
        //do nothing 已经是开门状态了，实际上这也是一个非法行为你也可以抛出异常
    }

    @Override
    public void closeDoor() {
        System.out.println("巴士关门了");
        //关门后，巴士变成关门行驶状态
        this.bus.setCurrentState(Bus.CLOSED_RUNNING_STATE);
    }

    @Override
    public void run() {
        //do nothing 已经是运行状态了
    }

    @Override
    public void stop() {
        System.out.println("巴士停车了");
        //停车后，巴士变成开门停车状态
        this.bus.setCurrentState(Bus.OPENED_STOPPED_STATE);
    }

    @Override
    public void pickUpPassenger() {
        throw new UnsupportedOperationException("开门运行状态下禁止乘客上车");
    }

    @Override
    public void dropOffPassenger() {
        throw new UnsupportedOperationException("开门运行状态下禁止乘客下车");
    }
}
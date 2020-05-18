package com.penglei.state3;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName BusState
 * @Description TODO
 * @date 2020-05-12 18:27
 */
/**
 * 巴士抽象状态类
 */
public abstract class BusState {
    /**持有Bus的引用*/
    protected Bus bus;

    public BusState(Bus bus) {
        this.bus = bus;
    }

    /**
     * 开车门
     */
    public abstract void openDoor();

    /**
     * 关车门
     */
    public abstract void closeDoor();

    /**
     * 巴士开始行驶
     */
    public abstract void run();

    /**
     * 停止巴士
     */
    public abstract void stop();

    /**
     * 乘客上车
     */
    public abstract void pickUpPassenger();

    /**
     * 乘客下车
     */
    public abstract void dropOffPassenger();
}
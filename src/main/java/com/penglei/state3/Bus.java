package com.penglei.state3;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Bus
 * @Description TODO
 * @date 2020-05-12 18:23
 */
public class Bus {
    /**分别代表四种状态*/
    public static BusState OPENED_STOPPED_STATE;
    public static BusState OPENED_RUNNING_STATE;
    public static BusState CLOSED_STOPPED_STATE;
    public static BusState CLOSED_RUNNING_STATE;
    /**当前状态*/
    private BusState mCurrentState;

    public Bus() {
        OPENED_STOPPED_STATE = new OpenedStoppedState(this);
        OPENED_RUNNING_STATE = new OpenedRunningState(this);
        CLOSED_STOPPED_STATE = new ClosedStoppedState(this);
        CLOSED_RUNNING_STATE = new ClosedRunningState(this);
    }

    /**
     * 设置当前的状态
     */
    public void setCurrentState(BusState state) {
        mCurrentState = state;
    }

    /**
     * 开车门
     */
    public void openDoor() {
        mCurrentState.openDoor();
    }

    /**
     * 关车门
     */
    public void closeDoor() {
        mCurrentState.closeDoor();
    }

    /**
     * 巴士开始行驶
     */
    public void run() {
        mCurrentState.run();
    }

    /**
     * 停止巴士
     */
    public void stop() {
        mCurrentState.stop();
    }

    /**
     * 乘客上车
     */
    public void pickUpPassenger() {
        mCurrentState.pickUpPassenger();
    }

    /**
     * 乘客下车
     */
    public void dropOffPassenger() {
        mCurrentState.dropOffPassenger();
    }
}
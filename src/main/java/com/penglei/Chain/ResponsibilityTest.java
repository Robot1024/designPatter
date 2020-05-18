package com.penglei.Chain;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ResponsibilityTest
 * @Description TODO
 * @date 2020-05-09 20:37
 */
public class ResponsibilityTest {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest();
        request.setLeaveDays(20);
        request.setName("小明");


        AbstractLeaveHandler directLeaderLeaveHandler = new DirectLeaderLeaveHandler("县令");
        DeptManagerLeaveHandler deptManagerLeaveHandler = new DeptManagerLeaveHandler("知府");
        GManagerLeaveHandler gManagerLeaveHandler = new GManagerLeaveHandler("京兆尹");

        directLeaderLeaveHandler.setNextHandler(deptManagerLeaveHandler);
        deptManagerLeaveHandler.setNextHandler(gManagerLeaveHandler);

        directLeaderLeaveHandler.handlerRequest(request);


    }
}
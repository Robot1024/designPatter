package com.penglei.Chain;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName DirectLeaderLeaveHandler
 * @Description TODO
 * @date 2020-05-09 20:27
 */
public class DirectLeaderLeaveHandler extends AbstractLeaveHandler{
    public DirectLeaderLeaveHandler(String name) {
        this.handlerName = name;
    }

    @Override
    protected void handlerRequest(LeaveRequest request) {
        if(request.getLeaveDays() <= this.MIN){
            System.out.println("直接主管:" + handlerName + ",已经处理;流程结束。");
            return;
        }

        if(null != this.nextHandler){
            this.nextHandler.handlerRequest(request);
        }else{
            System.out.println("审批拒绝！");
        }

    }
}
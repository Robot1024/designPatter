package com.penglei.Chain;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName DeptManagerLeaveHandler
 * @Description TODO
 * @date 2020-05-09 20:28
 */
public class DeptManagerLeaveHandler extends AbstractLeaveHandler {

    public DeptManagerLeaveHandler(String name) {
        this.handlerName = name;
    }

    @Override
    protected void handlerRequest(LeaveRequest request) {
        if(request.getLeaveDays() >this.MIN && request.getLeaveDays() <= this.MIDDLE){
            System.out.println("部门经理:" + handlerName + ",已经处理;流程结束。");
            return;
        }

        if(null != this.nextHandler){
            this.nextHandler.handlerRequest(request);
        }else{
            System.out.println("审批拒绝！");
        }
    }
}
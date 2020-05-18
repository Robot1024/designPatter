package com.penglei.Chain;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName LeaveRequest
 * @Description TODO
 * @date 2020-05-09 20:25
 */
public class LeaveRequest {
    /**天数*/
    private int leaveDays;

    /**姓名*/
    private String name;

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
package com.penglei.command;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Order
 * @Description TODO
 * @date 2020-05-09 21:20
 *
 * 创建一个命令接口， 未来后面 包装的 命令对象，执行。
 */
public interface Order {
    void execute();
}
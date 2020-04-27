package com.penglei.staticProxy;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ProxySubject
 * @Description 代理对象
 * @date 2020-04-27 15:15
 */
public class ProxySubject implements Subject{

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        System.out.println("女朋友出门前小鹏带钥匙");
        System.out.println("=============");
        subject.visit();
        System.out.println("=============");
        System.out.println("女朋友吃饭后小鹏付钱");
        System.out.println("=============");
        System.out.println("我太难了");
    }
}

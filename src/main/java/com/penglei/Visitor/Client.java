package com.penglei.Visitor;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020-05-12 19:40
 */
public class Client {

    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }
}
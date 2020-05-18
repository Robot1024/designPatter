package com.penglei.nullPattern;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName RealCustomer
 * @Description TODO
 * @date 2020-05-12 19:17
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
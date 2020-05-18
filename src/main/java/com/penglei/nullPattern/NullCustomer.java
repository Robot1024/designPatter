package com.penglei.nullPattern;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName NullCustomer
 * @Description TODO
 * @date 2020-05-12 19:17
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
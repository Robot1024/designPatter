package com.penglei.nullPattern;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName CustomerFactory
 * @Description TODO
 * @date 2020-05-12 19:17
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
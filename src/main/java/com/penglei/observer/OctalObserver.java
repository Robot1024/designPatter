package com.penglei.observer;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName OctalObserver
 * @Description TODO
 * @date 2020-05-09 16:18
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
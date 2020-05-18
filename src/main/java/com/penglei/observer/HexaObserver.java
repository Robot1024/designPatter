package com.penglei.observer;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName HexaObserver
 * @Description TODO
 * @date 2020-05-09 16:19
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}

package com.penglei.Mediator;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ChatRoom
 * @Description TODO
 * @date 2020-05-10 01:26
 */
import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
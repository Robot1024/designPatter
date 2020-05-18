package com.penglei.composite;

import java.util.ArrayList;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Composite
 * @Description TODO
 * @date 2020-05-09 00:36
 */

public class Composite extends Component{
    //首先来一个存储的集合

    private ArrayList<Component> list = new ArrayList() ;


    public Composite(String component) {
        super(component);
    }

    @Override
    public void addComposite(Component c){
        list.add(c);
    }


    @Override
    public void removeComposite(Component c){
        list.remove(c);
    }

    @Override
    public Component getComposite(int c){
        Component c1 =list.get(c);
        return c1;
    }



    public void operation(){

        System.out.println(list.size()+"======");
        for(Object obj:list){
            ((Component)obj).operation();
        }
    }


}
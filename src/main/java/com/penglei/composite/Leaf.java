package com.penglei.composite;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Leaf
 * @Description TODO
 * @date 2020-05-09 00:31
 */
public class Leaf extends Component{

    //首先重写component的方法
    //叶子节点关键点在于业务

    public Leaf(String component) {
        super(component);
    }

    @Override
    public void operation(){
        System.out.print("业务方法");
    }
    @Override
    public void addComposite(Component c){
        //提示报错呗 。
        System.out.print("不是子容器");
    }
    @Override
    public void removeComposite(Component c){
        //提示报错呗 。
        System.out.print("不是子容器");
    }


    @Override
    public Component getComposite(int i) {
        return null;
    }

}
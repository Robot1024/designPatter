package com.penglei.iterator;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName IteratorPatternDemo
 * @Description TODO
 * @date 2020-05-09 15:54
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
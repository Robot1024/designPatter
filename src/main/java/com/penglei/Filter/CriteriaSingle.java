package com.penglei.Filter;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName CriteriaSingle
 * @Description TODO
 * @date 2020-05-09 19:38
 */
import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
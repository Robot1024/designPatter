package com.penglei.Filter;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName CriteriaMale
 * @Description TODO
 * @date 2020-05-09 19:37
 */
import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
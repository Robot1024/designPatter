package com.penglei.Filter;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName CriteriaFemale
 * @Description TODO
 * @date 2020-05-09 19:38
 */
import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
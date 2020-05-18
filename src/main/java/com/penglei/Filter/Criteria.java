package com.penglei.Filter;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Criteria
 * @Description TODO
 * @date 2020-05-09 19:37
 */
import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
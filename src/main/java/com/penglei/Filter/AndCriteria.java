package com.penglei.Filter;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName AndCriteria
 * @Description TODO
 * @date 2020-05-09 19:39
 */
import java.util.List;

// 求两个过滤器的  and  并且的关系，要满足条件一，同时也满足条件二
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
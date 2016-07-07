package com.andreakim.marbles;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andreakim on 7/6/16.
 */
class Person {
    public int marbleCount;
    public int descendants;

    public Person() {
        super();
        ArrayList<Integer> descendants = new ArrayList() {};

    }

    //Returns the descendants
    public ArrayList<Integer> getDescendants()
    {
        return this.descendants;
    };

    //Set the descendants of the person
    public void setDescendants(ArrayList<Integer> descendants)
    {
        this.descendants = descendants;
    };

    //Returns the ArrayList<Integer> as a List of ArrayList<Integer> objects
    public List<ArrayList<Integer>> toList()
    {
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        SumMarbles(descendants, list);
        return list;
    };

    public String toString()
    {
        return toList().toString();
    };

    private void SumMarbles(ArrayList<Integer> element, List<ArrayList<Integer>> list)
    {
        list.add(element);
        for(ArrayList<Integer> data : element.getChildren())
        {
            SumMarbles(data, list);
        }
    };
}

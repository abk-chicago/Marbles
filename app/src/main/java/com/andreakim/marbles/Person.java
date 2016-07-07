package com.andreakim.marbles;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andreakim on 7/6/16.
 */
class Person {
    public int mMarbleCount;
    public int mDescendants;

    public Person() {
        super();
        ArrayList<Integer> descendants = new ArrayList();
        descendants.add(10);
        descendants.add(1);
        descendants.add(5);
        descendants.add(7);
        descendants.add(2);
        descendants.add(3);
        descendants.add(4);
    }

    public int SumMarbles(int mMarbleCount) {

        //   Function to be repeated:   # of marbles + children
        for (int i = 0; i < descendants.size(); i++) {
            mDescendants = descendants(i)++;
        }

        return mMarbleCount;
    }


}

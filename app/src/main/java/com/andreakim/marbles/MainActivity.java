package com.andreakim.marbles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        Person p6 = new Person();
        Person p7 = new Person();
    }

    TextView tv = (TextView)findViewById(R.id.textView);



}


/* Instructions:
For this assignment you will implement a class called Person.

 Each person has some number of marbles and some number of children.

 Implement a function in the Person class called SumMarbles that returns the total number of marbles a person has in addition to the total number of marbles of all of the Person’s descendants (hint: they're people, like soylent green).

 In an Android application, place the results inside of a TextView. You may debug as needed.

 In the example below, each circle represents a person, each number inside the circle represents the number of marbles each person has. The numbers in green show the expected output of the SumMarbles function applied to each person.
________________________________________________________
p1 has 10 marbles, 32 including all his children's
p2,3,4 are children of p1

p2 has 1 marble, but 6 including his children's marbles
p5,6 are his children
p5 has 2 marbles and no children
p6 has 3 marbles and no children
___
p3 has 5 marbles and no children
___
p4 has 7 marbles of his own and 11 including those of his children
p8 is child of p7
p8 has 4 marbles and no children
________________________________________________________

*/
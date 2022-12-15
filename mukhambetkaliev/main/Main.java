package com.mukhambetkaliev.main;


import com.mukhambetkaliev.fraction.Fraction;
import com.mukhambetkaliev.geometry.Point;
import com.mukhambetkaliev.student.Rulable;
import com.mukhambetkaliev.student.Rule;
import com.mukhambetkaliev.student.Save;
import com.mukhambetkaliev.student.Student;

public class Main {
    public static void main(String[] args) {
        Rule rule = new Rule();
        Student student = new Student("Arthur", rule,5,2,3,3,4,4,2,5,5,2);
        Save save = new Save(student);
        Student student1 = (Student) save.load();
        System.out.println(student1);
    }
}
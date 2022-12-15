package com.mukhambetkaliev.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student implements Saveble{

    Rulable rule;
    String name;
    List<Integer> marks = new ArrayList<>();

    public Student(String name, Rulable rule, Integer... marks) {
        this.name = name;
        this.rule = rule;
        for (int i:
             marks) {
            if (!rule.checkRule(i)) {
                throw new IllegalArgumentException();
            }
        }
        this.marks = Arrays.asList(marks);
    }

    public void addMarks(int... marks) {
        for (int i:
                marks) {
            if (!rule.checkRule(i)) {
                this.marks.add(i);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public Student save() {
        return this.clone();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public Student clone() {
        try {
            Student student = (Student) super.clone();
            student.marks = new ArrayList<>(marks);
            return student;
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
}

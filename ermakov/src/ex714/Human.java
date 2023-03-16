package ex714;

import huin9.AValidate;
import huin9.Default;
import huin9.Validate;

@AValidate
public class Human {
    int age;
    String name;

    public Human(int age) {
        this.age = age;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

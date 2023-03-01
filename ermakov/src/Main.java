import ex714.Human;
import ex714.HumanTests;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
        Qwerty qwerty = UtilityClass.cache(new Qwerty("first"));
        System.out.println(qwerty.cacheTest());
        System.out.println(qwerty.cacheTest());


    }
}

class A extends Entity{
    String s = "hello";
    int x = 42;
}

class B extends A{
    String text = "B";
}

class C extends B {
    String textC = "C";
}
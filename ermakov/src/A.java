import huin9.*;
import static huin9.EnumFor723.YES;
import static huin9.EnumFor723.NO;

@Default

public class A extends Entity{
    @ToString(NO)
    String s;
    int x;

    boolean bool;
    A a;
    Object ob;
    @Invoke
    String m1() {
        return "text";
    }

    String m2() {
        return "place";
    }

    @Invoke
    Integer m3() {
        return 42;
    }

}

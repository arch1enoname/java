package huin9;

import java.lang.reflect.Field;

public class Entity {
    @Override
    public String toString() {
        String s = "";
        s += this.getClass();
        s += " ";

        try {
            Object obj = this;
            if (obj.getClass().getAnnotation(ToString.class).value() == EnumFor723.NO) {
                return "";
            }
            while (obj.getClass().getSuperclass()!=Object.class) {
                Field[] fields = obj.getClass().getDeclaredFields();

                for (Field field : fields) {
                    field.setAccessible(true);
                    if (field.getAnnotation(ToString.class) != null) {
                        if (field.getAnnotation(ToString.class).value() == EnumFor723.NO) {
                            continue;
                        }
                    }
                    s += field.getName();
                    s += " = ";
                    try {
                        s += field.get(obj);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                    s += " ";
                }
                obj = obj.getClass().getSuperclass().newInstance();
                fields = obj.getClass().getDeclaredFields();
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }




        return s;
    }
}

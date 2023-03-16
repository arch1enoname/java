import ex714.Human;
import ex714.HumanTests;
import huin9.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {

//        Human human = new Human(77, "Vova");
//        validate(human);

    }











    static void validate(Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Class> clzs = new ArrayList<>();
        List<Annotation> annotations = null;

        clzs = Arrays.asList(object.getClass().getAnnotation(Validate.class).value());

        for (Class a:
             clzs) {
            System.out.println(a.isAnnotationPresent(Validate.class));
        }

        for (Class clz:
             clzs) {
            Method[] methods = clz.getDeclaredMethods();
            for (Method method : methods) {
                method.setAccessible(true);
                method.invoke(null, object);
            }
        }
    }

    static void reset(Object... objects) throws IllegalAccessException {
        List<Field> fields = null;
        for (Object obj:
             objects) {
            Class clz = obj.getClass();
            fields = Arrays.asList(clz.getDeclaredFields());
            if (clz.getAnnotation(Default.class) != null) {
                for (int i = 0; i < fields.size(); i++) {
                    fields.get(i).setAccessible(true);
                    if (fields.get(i).getType() == int.class) {
                        fields.get(i).setInt(obj, DefaultValues.DEFAULT_INT);
                    } else if (fields.get(i).getType() == double.class) {
                        fields.get(i).setDouble(obj, DefaultValues.DEFAULT_DOUBLE);
                    } else if (fields.get(i).getType() == float.class) {
                        fields.get(i).setFloat(obj, DefaultValues.DEFAULT_FLOAT);
                    } else if (fields.get(i).getType() == long.class) {
                        fields.get(i).setLong(obj, DefaultValues.DEFAULT_LONG);
                    } else if (fields.get(i).getType() == short.class) {
                        fields.get(i).setShort(obj, DefaultValues.DEFAULT_SHORT);
                    } else if (fields.get(i).getType() == byte.class) {
                        fields.get(i).setByte(obj, DefaultValues.DEFAULT_BYTE);
                    } else if (fields.get(i).getType() == String.class) {
                        fields.get(i).set(obj, DefaultValues.DEFAULT_STRING);
                    } else if (fields.get(i).getType() == char.class) {
                        fields.get(i).setChar(obj, DefaultValues.DEFAULT_CHAR);
                    } else if (fields.get(i).getType() == boolean.class) {
                        fields.get(i).setBoolean(obj, DefaultValues.DEFAULT_BOOLEAN);
                    } else {
                        fields.get(i).set(obj, null);
                    }
                }
                continue;
            }
            for (int i = 0; i < fields.size(); i++) {
                fields.get(i).setAccessible(true);
                if (fields.get(i).getAnnotation(Default.class) != null) {
                    if (fields.get(i).getType() == int.class) {
                        fields.get(i).setInt(obj, DefaultValues.DEFAULT_INT);
                    } else if (fields.get(i).getType() == double.class) {
                        fields.get(i).setDouble(obj, DefaultValues.DEFAULT_DOUBLE);
                    } else if (fields.get(i).getType() == float.class) {
                        fields.get(i).setFloat(obj, DefaultValues.DEFAULT_FLOAT);
                    } else if (fields.get(i).getType() == long.class) {
                        fields.get(i).setLong(obj, DefaultValues.DEFAULT_LONG);
                    } else if (fields.get(i).getType() == short.class) {
                        fields.get(i).setShort(obj, DefaultValues.DEFAULT_SHORT);
                    } else if (fields.get(i).getType() == byte.class) {
                        fields.get(i).setByte(obj, DefaultValues.DEFAULT_BYTE);
                    } else if (fields.get(i).getType() == String.class) {
                        fields.get(i).set(obj, DefaultValues.DEFAULT_STRING);
                    } else if (fields.get(i).getType() == char.class) {
                        fields.get(i).setChar(obj, DefaultValues.DEFAULT_CHAR);
                    } else if (fields.get(i).getType() == boolean.class) {
                        fields.get(i).setBoolean(obj, DefaultValues.DEFAULT_BOOLEAN);
                    } else {
                        fields.get(i).set(obj, null);
                    }
                }
            }
        }
    }

    static HashMap<String, Object> collect(Class... classes) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        HashMap<String, Object> hashMap = new HashMap<>();
        List<Method> methods = null;
        for (Class clz:classes) {
            methods = Arrays.asList(clz.getDeclaredMethods());
            for (int i = 0; i < methods.size(); i++) {

                if (methods.get(i).getParameterCount() == 0 && methods.get(i).getAnnotation(Invoke.class) != null && methods.get(i).getAnnotation(Invoke.class) != null) {
                    hashMap.put(methods.get(i).getName(), methods.get(i).invoke(clz.newInstance(), null));
                }

            }
        }
        return hashMap;
    }
}


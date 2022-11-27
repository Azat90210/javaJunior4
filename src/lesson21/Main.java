package lesson21;

import javax.print.Doc;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class docClass = Class.forName("lesson21.Doctor");
        Field[] fields = docClass.getFields();
        Field[] declaredFields = docClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println();
        Field name = docClass.getDeclaredField("name");
        System.out.println(name);

        System.out.println();
        Method setName = docClass.getMethod("setName", String.class);
        System.out.println(setName);

        System.out.println();
        Method[] declaredMethods = docClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        System.out.println();
        //Object o = docClass.newInstance();
        Doctor doc = (Doctor) docClass.newInstance();
        System.out.println(doc);

        System.out.println();
        Constructor constructor = docClass.getConstructor();
        Doctor doc2 = (Doctor)constructor.newInstance();
        System.out.println(doc2);

        System.out.println();
        Constructor constructor1 = docClass.getConstructor(String.class, int.class, double.class);
        Doctor qwe = (Doctor)constructor1.newInstance("qwe", 1, 2);
        System.out.println(qwe);

        System.out.println();





    }
}

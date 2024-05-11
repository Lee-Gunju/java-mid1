package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) throws Exception {

        //Class clazz = String.class;

        Class clazz = new String().getClass();
        //Class clazz2 = Class.forName("java.lang.String");

        // 해당 클래스의 모든 필드 출력;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        // 상위 클래스 호출
        System.out.println(clazz.getSuperclass().getName());

        // interfaces 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println(i.getName());
        }
    }
}

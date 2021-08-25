package Task70_72_ReflectionsAPI;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class task72 {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person();
        task72 Task72 = new task72 ();
        Task72.print(person, person.getClass());
    }
    void print (Object o, Class c) throws IllegalAccessException {
        Method[]methods = c.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation:annotations) {
                if (annotation.annotationType().equals(AcademyInfo.class)){
                    System.out.println(method.getName());
                }
            }

        }
    }
}
@Retention(RetentionPolicy.RUNTIME)
@interface AcademyInfo {
    boolean year () default true;

}
class Person {

    private String year = "2021";

    @AcademyInfo
    void Doobleyear() {
        String Doobleyear = year + year;
        System.out.println(Doobleyear);
    }

    void TripleYear() {
        String TripleYear = year + year + year;
        System.out.println(TripleYear);
    }
}

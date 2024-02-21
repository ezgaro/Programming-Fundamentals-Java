import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<MySubjectExample> clazz = MySubjectExample.class;
        Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
        Subject annotation = clazz.getAnnotation(Subject.class);
        String[] categories = annotation.categories();

        MySubjectExample mySubjectExample = new MySubjectExample();
        Field field = clazz.getDeclaredField("dbEndPoint");
        field.setAccessible(true);
        FieldValue annotationOfField = field.getAnnotation(FieldValue.class);
        field.set(mySubjectExample, annotationOfField.value());

    }
}
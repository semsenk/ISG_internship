package annotationTask;

import java.lang.annotation.Annotation;

public class AnnotationDemo {

    public static void main(String[] args) {
        MacBook macBook = new MacBook("pro", 15);
        System.out.println("MacBook " +
                macBook
                        .getClass()
                        .getAnnotation(Laptop.class)
                        .os()
        );
    }
}

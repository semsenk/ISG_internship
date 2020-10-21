package annotationTask;

import java.lang.annotation.Annotation;

public class AnnotationDemo {

    public static void main(String[] args) {
        MacBook macBook = new MacBook("pro", 15);

//        Class getClass = macBook.getClass();
//        Annotation getAnnot = getClass.getAnnotation(Laptop.class);
        System.out.printf("MacBook %s%n",
                MacBook
                        .getClass()
                        .getAnnotation(Laptop.class)
                        .os());
    }
}

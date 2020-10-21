package annotationTask;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//meta annotation
@Target(ElementType.TYPE)  // TYPE use on class
@Retention(RetentionPolicy.RUNTIME)
public @interface Laptop {

    String os() default "Windows";
}
package lessons.alishevCourse.forContinuers.annotation.lesson1.ownAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
public @interface MethodInfo {
    String author() default "some Author";
    int dateOfCreation() default 2022;
    String purpose();
}

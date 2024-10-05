package Ejer2.Anotacion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention( RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Empleados {
    Empleado[] value();
}
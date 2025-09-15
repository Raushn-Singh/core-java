import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface _01_Bank_User_Defined_annotation {
  String bid() default "B-111";

  String bname() default "AXIS Bank";

  String branch() default "Ameerpeet";
}


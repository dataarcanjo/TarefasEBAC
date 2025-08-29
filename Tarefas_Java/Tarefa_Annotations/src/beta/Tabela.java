package beta;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Tabela {

	String nome();
	
	String nomeDefault() default "Tabela";
}

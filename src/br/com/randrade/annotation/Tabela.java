package br.com.randrade.annotation;

import java.lang.annotation.*;

//utilizado para incluir no javadoc
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Tabela {

    String value();

}

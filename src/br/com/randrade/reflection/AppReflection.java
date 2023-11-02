package br.com.randrade.reflection;

import java.lang.annotation.Annotation;

public class AppReflection {

    public static void main(String[] args) {
        ProdutoReflection produto = new ProdutoReflection();
        Annotation[] annotations = produto.getClass().getAnnotations();
        for (Annotation anotacao : annotations) {
            System.out.println(anotacao);
        }
    }

}

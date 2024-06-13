package stream_API;

import java.util.Arrays;
import java.util.List;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */
public class FunctionTeste {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

//        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream().map(integer -> integer * 2).toList();

        numerosDobrados.forEach(System.out::println);
    }
}

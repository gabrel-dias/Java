package stream_API;

import java.util.Arrays;
import java.util.List;

public class ConsumerTeste {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.forEach(numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        });
    }
}

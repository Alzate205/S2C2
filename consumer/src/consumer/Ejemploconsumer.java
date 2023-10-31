package consumer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Ejemploconsumer {
    public static void main(String[] args) {

        List<String> equipos = new ArrayList<>();
        equipos.add("Barcelona");
        equipos.add("Bayern");
        equipos.add("Quindio");

        Consumer<List <String>> consumer = lista -> {
            Collections.reverse(lista);
            lista.forEach(System.out::println);
        };
        consumer.accept(equipos);
    }
}

package biConsumer;

import java.util.function.BiConsumer;

public class EjemploBiconsumer {
    public static void main(String[] args) {
        Jugador1 Jugador1 = new Jugador1("Diego", "Messi", "Aguatero", "Barcelona");

        Equipos equipo = new Equipos("Quindio");

        BiConsumer<Jugador1, Equipos> biConsumer = (jug, equi) -> jug.setEquipos(equi.getNombre());
        biConsumer.accept(Jugador1, equipo);

        System.out.println("Nombre: " + Jugador1.getNombre());
        System.out.println("Apellidos: " + Jugador1.getApellidos());
        System.out.println("posicion: " + Jugador1.getPosicion());
        System.out.println("Equipo: " + Jugador1.getEquipos());
    }
}

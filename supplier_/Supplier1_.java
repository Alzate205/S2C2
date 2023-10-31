package supplier_;

import java.util.function.Supplier;
public class Supplier1_ {
    private String nombreJuego;

    public Supplier1_(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getnombreJuego() {
        return nombreJuego;
    }
    public static void main(String[] args) {
        Supplier1_ juego = new Supplier1_("overcooked");
        Supplier<String> juegoSupplier = juego::getnombreJuego;
        String Jueguito = juegoSupplier.get();
        System.out.println("El nombre del juego es: " + Jueguito);
    }
}

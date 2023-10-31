package supplier;

import java.util.function.Supplier;

public class Equipo {
    private String nombreEquipo;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getnombreEquipo() {
        return nombreEquipo;
    }

    public static void main(String[] args) {
        Equipo equipo = new Equipo("Alianza petrolera");
        Supplier<String> equipoSupplier = equipo::getnombreEquipo;
        String team = equipoSupplier.get();
        System.out.println("Nombre de su equipo: " + team);
    }
}

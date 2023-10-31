package consumer;

public class Jugador {
    private String nombre;
    private float numero_camiseta;

    public Jugador(String nombre, float numero_camiseta) {
        this.nombre = nombre;
        this.numero_camiseta = numero_camiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNumero() {
        return numero_camiseta;
    }
}

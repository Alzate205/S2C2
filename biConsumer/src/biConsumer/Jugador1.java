package biConsumer;

public class Jugador1 {
    private String nombre;
    private String apellidos;
    private String  posicion;
    private String Equipos;

    public Jugador1(String nombre, String apellidos, String posicion, String Equipos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.posicion = posicion;
        this.Equipos = Equipos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getEquipos() {
        return Equipos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEquipos(String Equipos) {
        this.Equipos = Equipos;
    }
}

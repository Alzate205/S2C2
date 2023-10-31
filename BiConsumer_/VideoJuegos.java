package BiConsumer_;


import java.util.function.BiConsumer;

public class VideoJuegos {
    public static void main(String[] args) {
        Juego video = new Juego("Riot", "juego tactico de 5 vs 5", "2011", "shooter");

        // Creamos un objeto CiudadResidencia
        Video jueguito = new Video("Valorant");

        // Actualizamos la ciudad de residencia del Empleado utilizando el BiConsumer
        BiConsumer<Juego, Video> biConsumer = (vid, jue) -> vid.setID(jue.getID());
        biConsumer.accept(video, jueguito);

        // Imprimimos los detalles del Empleado actualizados
        System.out.println("Nombre del juego es: " + video.getID());
        System.out.println("jugabilidad del juego: " + video.getJugability());
        System.out.println("tipo de juego: " + video.getTipeGame());
        System.out.println("año de creacion: " + video.getYearCreation());
    }
}

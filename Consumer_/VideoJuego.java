package Consumer_;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class VideoJuego {
    public static void main(String[] args) {
        List<Juego> video = new ArrayList<>();
        video.add(new Juego("RiotGames","Valorant" ));
        video.add(new Juego("Steam", "Apex"));
        video.add(new Juego("EpicGames","Rocket League" ));

        Consumer<List<Juego>> consumer = (listaJuegos) -> {
            for(Juego videos : listaJuegos) {
                System.out.println("En " + videos.getID() + " podemos iniciar/jugar " + videos.getGame());
            }
        };
        consumer.accept(video);
    }

}

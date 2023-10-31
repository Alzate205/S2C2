package BiConsumer_;

public class Juego {
        private String ID;
        private String TipeGame;
        private String YearCreation;
        private String Jugability;

    public Juego(String ID, String tipeGame, String yearCreation, String jugability) {
        this.ID = ID;
        TipeGame = tipeGame;
        YearCreation = yearCreation;
        Jugability = jugability;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTipeGame() {
        return TipeGame;
    }

    public void setTipeGame(String tipeGame) {
        TipeGame = tipeGame;
    }

    public String getYearCreation() {
        return YearCreation;
    }

    public void setYearCreation(String yearCreation) {
        YearCreation = yearCreation;
    }

    public String getJugability() {
        return Jugability;
    }

    public void setJugability(String jugability) {
        Jugability = jugability;
    }
}


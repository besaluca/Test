public class Rege extends PiesaSah {

    public Rege(int coordX, int coordY) {
        super("Rege", coordX, coordY);
    }

    public boolean mutaPiesa(int newX, int newY) {
        int dx = Math.abs(newX - coordX);
        int dy = Math.abs(newY - coordY);
        return dx <= 1 && dy <= 1;
    }
}

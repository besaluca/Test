public class Pion extends PiesaSah {

    public Pion(int coordX, int coordY) {
        super("Pion", coordX, coordY);
    }

    public boolean mutaPiesa(int newX, int newY) {
        return newX == coordX + 1 && newY == coordY;
    }
}

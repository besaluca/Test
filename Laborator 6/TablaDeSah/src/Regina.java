public class Regina extends PiesaSah {

    public Regina(int coordX, int coordY) {
        super("Regina", coordX, coordY);
    }

    public boolean mutaPiesa(int newX, int newY) {
        boolean diagonala = Math.abs(newX - coordX) == Math.abs(newY - coordY);
        boolean linie = newX == coordX;
        boolean coloana = newY == coordY;
        return diagonala || linie || coloana;
    }
}

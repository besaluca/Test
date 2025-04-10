public class Fractie implements Numeric {
    public int numarator;
    public int numitor;

    public Fractie(int numarator, int numitor) {
        this.numarator = numarator;
        this.numitor = numitor;
    }
    public Numeric adunare(Numeric n) {
        Fractie f = (Fractie) n;
        int numitorComun = this.numitor * f.numitor;
        int numaratorNou = this.numarator * f.numitor + f.numarator * this.numitor;
        return new Fractie(numaratorNou, numitorComun);
    }

    @Override
    public Numeric scadere(Numeric n) {
        
    }

    public Numeric inmultire(Numeric n) {
        Fractie f = (Fractie) n;

    }

}
public class Ghiozdan {
    private Rechizita[] rechizite;
    private int index;

    public Ghiozdan() {
        rechizite = new Rechizita[100];
        index = 0;
    }

    public void add(Caiet c) {
        rechizite[index++] = c;
    }

    public void add(Manual m) {
        rechizite[index++] = m;
    }

    public void listItems() {
        for (int i = 0; i < index; i++) {
            System.out.println(rechizite[i].getNume());
        }
    }

    public void listManual() {
        for (int i = 0; i < index; i++) {
            if (rechizite[i] instanceof Manual) {
                System.out.println(rechizite[i].getNume());
            }
        }
    }

    public void listCaiet() {
        for (int i = 0; i < index; i++) {
            if (rechizite[i] instanceof Caiet) {
                System.out.println(rechizite[i].getNume());
            }
        }
    }

    public int getNrRechizite() {
        return index;
    }

    public int getNrManuale() {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (rechizite[i] instanceof Manual) {
                count++;
            }
        }
        return count;
    }

    public int getNrCaiete() {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (rechizite[i] instanceof Caiet) {
                count++;
            }
        }
        return count;
    }
}

public class TestSah {
    public static void main(String[] args) {
        Tura t = new Tura(0, 0);
        System.out.println("Tura (0,0) -> (0,5): " + t.mutaPiesa(0, 5));
        System.out.println("Tura (0,0) -> (3,3): " + t.mutaPiesa(3, 3));

        Nebun n = new Nebun(2, 2);
        System.out.println("Nebun (2,2) -> (4,4): " + n.mutaPiesa(4, 4));
        System.out.println("Nebun (2,2) -> (2,4): " + n.mutaPiesa(2, 4));

        Pion p = new Pion(1, 1);
        System.out.println("Pion (1,1) -> (2,1): " + p.mutaPiesa(2, 1));
        System.out.println("Pion (1,1) -> (3,1): " + p.mutaPiesa(3, 1));

        Cal c = new Cal(3, 3);
        System.out.println("Cal (3,3) -> (5,4): " + c.mutaPiesa(5, 4));
        System.out.println("Cal (3,3) -> (4,5): " + c.mutaPiesa(4, 5));
        System.out.println("Cal (3,3) -> (4,4): " + c.mutaPiesa(4, 4));

        Regina q = new Regina(4, 4);
        System.out.println("Regina (4,4) -> (4,7): " + q.mutaPiesa(4, 7));
        System.out.println("Regina (4,4) -> (7,7): " + q.mutaPiesa(7, 7));
        System.out.println("Regina (4,4) -> (5,6): " + q.mutaPiesa(5, 6));

        Rege k = new Rege(4, 4);
    }
}
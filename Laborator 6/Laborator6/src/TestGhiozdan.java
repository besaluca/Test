public class TestGhiozdan {
    public static void main(String[] args) {
        Ghiozdan ghiozdan = new Ghiozdan();

        ghiozdan.add(new Caiet("Română"));
        ghiozdan.add(new Manual("Matematică"));
        ghiozdan.add(new Caiet("Biologie"));
        ghiozdan.add(new Manual("Istorie"));
        ghiozdan.add(new Caiet("Desen"));

        System.out.println("Număr total de rechizite: " + ghiozdan.getNrRechizite());
        System.out.println("Număr de caiete: " + ghiozdan.getNrCaiete());
        System.out.println("Număr de manuale: " + ghiozdan.getNrManuale());

        System.out.println("\nToate rechizitele:");
        ghiozdan.listItems();

        System.out.println("\nDoar caietele:");
        ghiozdan.listCaiet();

        System.out.println("\nDoar manualele:");
        ghiozdan.listManual();
    }
}

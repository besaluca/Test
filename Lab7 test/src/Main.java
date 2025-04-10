//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Vehicul {
    void accelereaza(int x);

    void accelereaza();
    void decelereaza();
    void getviteza();
}
class Autoturism implements Vehicul {
    private String marca;
    private int viteza;
    private String culoare;
    private int capacitate;
    private String tipMotocicleta;
    public Autoturism(String marca, String culoare, int capacitate){
        this.marca = marca;
        this.culoare = culoare;
        this.capacitate = capacitate;
        this.viteza = 0;
    }

    public Autoturism() {
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){ return this.marca; }
    public void setCuloare(String culoare){
        this.culoare = culoare;
    }
    public String getCuloare(){ return this.culoare; }
    public void setCapacitate(int capacitate){
        this.capacitate = capacitate;
    }
    public String setCapacitate(){ return this.capacitate+""; }

    @Override
    public void accelereaza(int x) {
        viteza=viteza+ x;
    }
    public void decelereaza(int x){
        viteza=viteza - x;
    }

    @Override
    public void accelereaza() {

    }

    @Override
    public void decelereaza() {

    }

    @Override
    public void getviteza() {
        getviteza();
    }
}
class Masina extends Autoturism {
    private int numarUsi;
    private String tipCombustibil;

    public Masina(int numarUsi, String tipCombustibil) {
        super();
        this.numarUsi = numarUsi;
        this.tipCombustibil = tipCombustibil;
    }

    public Masina(String marca, String culoare, int capacitate) {
        super(marca, culoare, capacitate);
    }

    public void setNumarUsi(int numarUsi) {
        this.numarUsi = numarUsi;
    }
    public int getNumarUsi() {
        return numarUsi;
    }
    public void setTipCombustibil(String tipCombustibil) {
        this.tipCombustibil = tipCombustibil;
    }
    public String getTipCombustibil() {
        return tipCombustibil;
    }
}
class Motocicleta extends Autoturism {
    private String tipMotocicleta;
    public Motocicleta(String tipMotocicleta){
        this.tipMotocicleta = tipMotocicleta;
    }
    public void setTipMotocicleta(String tipMotocicleta) {
        this.tipMotocicleta = tipMotocicleta;
    }
    public String getTipMotocicleta() {
        return tipMotocicleta;
    }
}

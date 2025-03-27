//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Complex a=  new Complex(1,1);
        Complex b= new Complex(2,2);
        Complex c= a.add(b);
        System.out.println(c.re+" "+c.im);



    }
}

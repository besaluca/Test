public class Complex {
    public double re,im;
    public Complex(double a, double b) {
        this.re = a;
        this.im = b;
    }
    public Complex add(Complex c) {
        double rezReal = this.re + c.re;
        double rezIm = this.im + c.im;

        return new Complex(rezReal, rezIm);
    }
}
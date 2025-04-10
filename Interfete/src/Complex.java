public class Complex implements Numeric {
    public double real;
    public double imag;
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public Numeric adunare(Numeric n) {
        Complex c = (Complex) n;
        return new Complex(this.real + c.real, this.imag + c.imag);
    }
    public Numeric scadere(Numeric n) {
        Complex c = (Complex) n;
        return new Complex(this.real - c.real, this.imag - c.imag);
    }
    public Numeric inmultire(Numeric n) {
        Complex c = (Complex) n;
        double real = this.real * c.real-this.imag * c.imag;
        double imag = this.real * c.imag + this.imag * c.real;
        return new Complex(real, imag);
    }

    @Override
    public Numeric inmultirescalar(double x) {
        return new Complex(this.real * x, this.imag * x);
    }
}

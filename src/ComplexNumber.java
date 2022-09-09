public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void  add(ComplexNumber second) {
        double r = this.real + second.real;
        double i = this.imaginary + second.imaginary;
        this.real = r;
        this.imaginary = i;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber second) {
        double r = this.real - second.real;
        double i = this.imaginary - second.imaginary;
        this.real = r;
        this.imaginary = i;
    }

}
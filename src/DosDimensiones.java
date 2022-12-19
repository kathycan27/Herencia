//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class DosDimensiones {
    private double base;
    private double altura;

    DosDimensiones() {
        this.base = this.altura = 0.0;
    }

    DosDimensiones(double a, double b) {
        this.base = b;
        this.altura = a;
    }

    DosDimensiones(double x) {
        this.base = this.altura = x;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double b) {
        this.base = b;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public void mostararDimension() {
        System.out.println("la base es: " + this.base + "la altura es" + this.altura);
    }
}

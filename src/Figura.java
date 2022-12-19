//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Figura {
    int x;
    int y;
    double perimetro;
    double area;

    public Figura() {
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void calcular_perimetro() {
        this.perimetro = (double)(2 * this.x + 2 * this.y);
    }

    public void calcular_area() {
        this.area = (double)(this.x * this.y);
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}

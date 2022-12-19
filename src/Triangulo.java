//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Triangulo extends DosDimensiones {
    private String estilo;

    Triangulo() {
        this.estilo = "ninguno";
    }

    Triangulo(String s, double b, double h) {
        super(b, h);
        this.estilo = s;
    }

    Triangulo(double x) {
        super(x);
        this.estilo = "Estilo Nuevo";
    }

    double area() {
        return this.getAltura() * this.getBase() / 2.0;
    }

    void mostrar_estilo() {
        System.out.println("El triangulo tiene " + this.estilo);
    }
}

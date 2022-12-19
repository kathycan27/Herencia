public class Menu {
    public Menu() {
    }
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        Cuadrado cuadrado = new Cuadrado();
        rectangulo.setX(20);
        rectangulo.setY(10);
        rectangulo.calcular_perimetro();
        rectangulo.calcular_area();
        System.out.println("Perimetro");
        System.out.println(rectangulo.getPerimetro());
        System.out.println("Area");
        System.out.println(rectangulo.getArea());
        System.out.println("");
        cuadrado.setX(4);
        cuadrado.setY(4);
        cuadrado.calcular_perimetro();
        cuadrado.calcular_area();
        System.out.println("Perimetro");
        System.out.println(cuadrado.getPerimetro());
        System.out.println("Area");
        System.out.println(cuadrado.getArea());
        System.out.println("");
    }
}
public class PruebaFigura {

    public static void main(String[] args) {

        Figura figura1 = new Circulo(5);
        Figura figura2 = new Rectangulo(6, 3);

        System.out.println(" ÁREAS ");

        figura1.calcularArea();
        figura2.calcularArea();
    }
}

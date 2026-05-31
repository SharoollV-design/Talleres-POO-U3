public class PruebaRectangulo {
    
    public static void main(String[] args) {
        
        Figura circulo = new Circulo(4);
        System.out.println("Area del circulo: " + circulo.calcularArea());

        System.out.println(" ");

        Figura rectangulo = new Rectangulo(5, 3);
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());

        System.out.println(" ");
    }
}

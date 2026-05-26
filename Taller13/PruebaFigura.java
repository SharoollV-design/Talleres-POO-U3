public class PruebaFigura {
    
    public static void main(String[] args) {
        
        Figura figura1 = new Rectangulo(4, 8);
        Figura figura2 = new Triangulo(5, 9);

        System.out.println(" Cálculo de áreas ");

        System.out.println(" Area del triangulo: " + figura1.calcularArea());
        System.out.println(" Area del rectangulo: " + figura2.calcularArea());
    }
}

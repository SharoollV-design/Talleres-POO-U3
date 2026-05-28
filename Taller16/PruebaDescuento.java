public class PruebaDescuento {
    
     public static void main(String[] args) {

        Descuento descuentoPorcentaje = new Descuento(25); 

        double precioOriginal = 100.0;

        System.out.println("Precio con descuento en porcentaje: " + descuentoPorcentaje.aplicar(precioOriginal));

        DescuentoFijo descuentoFijo = new DescuentoFijo(15);

        System.out.println("Precio con descuento fijo: " + descuentoFijo.aplicar(precioOriginal));
    }

}

public class PruebaVehiculo {
    
    public static void main(String[] args) {
        
        Conducible camion1 = new Camion();
        camion1.conducir();

        System.out.println(" ");
        
        Transportador camion2 = new Camion();
        camion2.cargarMercancia();
    }
}

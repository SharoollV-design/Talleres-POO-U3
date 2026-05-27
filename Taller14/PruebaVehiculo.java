public class PruebaVehiculo {
    
    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Coche("Mazda");
        Vehiculo vehiculo2 = new Bicicleta("Montaña");

        System.out.println(" Vehiculoos");
        vehiculo1.mover();
        vehiculo2.mover();
    }
}

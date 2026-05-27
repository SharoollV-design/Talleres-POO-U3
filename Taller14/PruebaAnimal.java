public class PruebaAnimal {
    
    public static void main(String[] args) {

        Animal animal = new Perro();

        animal.hacerSonido();

        // Esto nos arroja un error de compilación
        // animal.moverCola();
        // La clase Animal no tiene ese método 
    }
}

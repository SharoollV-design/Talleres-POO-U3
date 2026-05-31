public class PruebaTransporte {

    public static void main(String[] args) {
        
        Transporte tran1 = new Bicicleta("Montaña");
        tran1.mover();

        System.out.println(" ");

        Transporte tran2 = new Coche("Mazda");
        tran2.mover();
    }
}

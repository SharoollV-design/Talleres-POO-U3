public class PruebaPato {
    
    public static void main(String[] args) {
        
        Nadador pato1 = new Pato("Donald");
        Volador pato2 = new Pato("Donald");

        System.out.println(" Movimientos del pato <3 ");

        pato1.nadar();
        pato2.volar();

    }
}

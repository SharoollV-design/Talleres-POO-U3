public class Cajero implements Retiro, Transferencia {
    
    @Override
    public void retirar(double monto){
        System.out.println("Retiro de: $" + monto);
    }

    public void transferir(double monto){
        System.out.println("Transferencia de: $" + monto);
    }
}

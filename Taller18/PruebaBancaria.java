public class PruebaBancaria {
    
    public static void main(String[] args) {
        
        Cajero cajero = new Cajero();
        cajero.retirar(150);
        cajero.transferir(50);

        Pagos pagos1 = new Pagos();
        pagos1.pagarFactura("Factura de la luz");
    }
}

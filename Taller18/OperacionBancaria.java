public interface OperacionBancaria {
    
    public void transferir(double monto);
    public void retirar(double monto);
    public void pagarFactura(String factura);
    
}

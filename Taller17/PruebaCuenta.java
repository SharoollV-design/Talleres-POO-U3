public class PruebaCuenta {
    
    public static void main(String[] args) {
        
        CuentaAhorros cuenta1 = new CuentaAhorros(1000, 0.09);
        cuenta1.depositar(1500);
        System.out.println("Saldo cuenta: " + cuenta1.getSaldo());
        
        System.out.println("");

        cuenta1.ainteres();
        System.out.println("Cuenta tras interes: " + cuenta1.getSaldo());

    }
}

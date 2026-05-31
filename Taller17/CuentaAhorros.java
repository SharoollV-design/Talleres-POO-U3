public class CuentaAhorros extends CuentaBancaria {
    
    private double tasaInteres;

    public CuentaAhorros(double saldoInicial, double tasaInteres){
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres(){
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres){
        this.tasaInteres = tasaInteres;
    }

    public void ainteres(){
        saldo += saldo * tasaInteres;
    }

}

public class CuentaBancaria {
    
    protected double saldo;

    public CuentaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void depositar(double monto){
        saldo += monto;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}

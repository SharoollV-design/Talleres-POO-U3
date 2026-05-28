public class Descuento {
    
    private double porcentaje;

    public Descuento(double porcentaje){
        this.porcentaje = porcentaje;
    }

    public double aplicar(double precio){
        return precio - (precio* porcentaje/100);
    }
}

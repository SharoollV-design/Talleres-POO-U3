public class DescuentoFijo extends Descuento {
    
    private double valorFijo;

    public DescuentoFijo(double valorFijo){
        super(0);
        this.valorFijo = valorFijo;
    }
    
    @Override
    public double aplicar(double precio){
        return precio -valorFijo;
    }
}

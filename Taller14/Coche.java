public class Coche extends Vehiculo {
    
    private String marca;

    public Coche(String marca) {
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){ 
        if(marca != null && !marca.trim().isEmpty()){
            this.marca = marca;
        } else {
            System.out.println("La marca está vacia");
        }
    }

    @Override
    public void mover(){
        System.out.println("El coche " + marca + "s está en movimiento");
    }
}

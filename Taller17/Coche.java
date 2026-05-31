public class Coche extends Transporte {
    
    private String tipo; 

    public Coche(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public void mover(){
        System.out.println("El vehiculo se mueve con motor");
    }
}

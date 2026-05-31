public class Bicicleta extends Transporte {
    
    private String tipo;

    public Bicicleta(String tipo){
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
        System.out.println("La bicicleta se mueve pedaleando");
    }
}

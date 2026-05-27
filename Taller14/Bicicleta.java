public class Bicicleta extends Vehiculo {
    
    private String tipo;

    public Bicicleta(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        if(tipo != null && !tipo.trim().isEmpty()) {
            this.tipo = tipo;
        } else {
            System.out.println("El tipo de bicicleta está vacio");
        }
    }

    @Override
    public void mover(){
        System.out.println("La bicleta de tipo " + tipo + " se esta moviendo");
    }
}

public class Pato implements Volador, Nadador {

    private String nombre;

    public Pato(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if (nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        } else {
            System.out.println("El nombre está vacío");
        }
    }

    @Override
    public void volar() {
        System.out.println( nombre + " está volando");
    }

    @Override
    public void nadar(){
        System.out.println( nombre + " está nadando");
    }
}

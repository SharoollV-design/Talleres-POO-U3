public class Profesor extends Persona {
    
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if( nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        } else {
            System.out.println("El nombre está vacio");
        }
    }

    @Override
    public void presentarse() {
        System.out.println("Hola soy profesor y mi nombre es: " + nombre);
    }
}

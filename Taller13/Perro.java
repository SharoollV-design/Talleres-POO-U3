public class Perro implements Animal{

    String nombre;

    //Una mala practica porque hay que utilizar el método abstracto

    @Override
    public void hacerSonido(){
        System.out.println("El perro se llama " + nombre + " y está ladrando");
    }
    
}
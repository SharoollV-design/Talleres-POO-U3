public class PruebaPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Estudiante("Jess");
        Persona persona3 = new Profesor("Valen");

        System.out.println(" Bienvenidos al Liceo ");

        persona1.presentarse();
        persona2.presentarse();
        persona3.presentarse();
    }
}

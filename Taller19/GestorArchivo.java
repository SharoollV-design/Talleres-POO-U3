public class GestorArchivo {
    
    private Almacenamiento almacenamiento;

    public GestorArchivo(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void almacenar(String dato) {
        almacenamiento.guardar(dato);
    }

    public void mostrarDatos(){
        String dato = almacenamiento.recuperar();
        System.out.println("Dato recuperado: " + dato);
    }
}

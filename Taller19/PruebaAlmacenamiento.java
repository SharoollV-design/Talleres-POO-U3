public class PruebaAlmacenamiento {
    
    public static void main(String[] args) {

        System.out.println(" ");
        
        GestorArchivo aLocal = new GestorArchivo(new AlmacenamientoLocal());
        aLocal.almacenar("Datos del usuario");
        aLocal.mostrarDatos();

        System.out.println(" ");

        GestorArchivo aNube = new GestorArchivo(new AlmacenamientoNube());
        aNube.almacenar("Datos de configuracion");
        aNube.mostrarDatos();
    }
}

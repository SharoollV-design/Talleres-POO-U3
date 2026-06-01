public class GestorAutenticacion {
    
    private ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio){
        this.servicio = servicio;
    }

    public void login(String usuario, String clave) {
        if(servicio.autenticar(usuario, clave)) {
            System.out.println("Acceso concedido ");
        } else {
            System.out.println("Acceso denegado a: " + usuario);
        }
    }
}

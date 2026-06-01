public class AutenticacionLocal implements ServicioAutenticacion {
    
    @Override
    public boolean autenticar(String usuario, String clave) {
        return "Admin".equals(usuario) && "S123456".equals(clave);
    }
}

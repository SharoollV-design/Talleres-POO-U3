public class AutenticacionOAuth implements ServicioAutenticacion {
    
    @Override
    public boolean autenticar(String usuario, String clave) {
        System.out.println("Autenticando con OAuth para usuario " + usuario);
        return true;
    }
}

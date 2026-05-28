public class Validar {

    public void validarContrasena(UsuarioSRP usuario) {
        
        if (usuario.getContrasena().length() >= 8) {
            
            System.out.println( "Contraseña válida" );

        } else {
            System.out.println("La contraseña debe tener mínimo 8 caracteres");
        }
    }
}
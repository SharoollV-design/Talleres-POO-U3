public class Autenticacion {
    
    public boolean autenticar(UsuarioSRP usuario, String contrasenaIngresada) {

        if (usuario.getContrasena().equals(contrasenaIngresada)) {
            System.out.println("Acceso permitido");
            return true;
        } else {
            System.out.println("Contraseña incorrecta");
            return false;
        }

    }
}

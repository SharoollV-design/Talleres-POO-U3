public class PruebaUsuarioSRP {
    public static void main(String[] args) {
        
        UsuarioSRP usuario1 = new UsuarioSRP("Sharoll", "12345678");

        usuario1.mostrarInfo();

        Validar validacion =new Validar();

        validacion.validarContrasena(usuario1);


        Autenticacion auth = new Autenticacion();

        auth.autenticar(usuario1,"12345678");
    }
}

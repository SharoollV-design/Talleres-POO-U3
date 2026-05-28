public class Usuario {
    
    private String nombre;
    private String contrasena;

    public Usuario(String nombre, String contraseña) {

        this.nombre = nombre;
        this.contrasena = contraseña;
    }

    public void mostrarInfo() {

        System.out.println("Usuario: " + nombre);
    }


    public boolean autenticar(String contraseñaIngresada) {

        return contrasena.equals(contraseñaIngresada);
    }


    public boolean validarContraseña() {

        return contrasena.length() >= 8;
    }
}
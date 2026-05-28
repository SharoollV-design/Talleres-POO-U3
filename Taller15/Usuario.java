public class Usuario {
    
    private String nombre;
    private String contrasena;

    public Usuario(String nombre, String contrasena) {

        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public void mostrarInfo() {

        System.out.println("Usuario: " + nombre);
    }


    public boolean autenticar(String contrasenaIngresada) {

        return contrasena.equals(contrasenaIngresada);
    }


    public boolean validarContrasena() {

        return contrasena.length() >= 8;
    }
}
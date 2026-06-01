public class PruebaAutenticacion {
    
    public static void main(String[] args) {
        
        System.out.println(" ");

        GestorAutenticacion gestor1 = new GestorAutenticacion(new AutenticacionLocal());
        gestor1.login("Admin", "S123456");
        gestor1.login("Sara", "123456");

        System.out.println(" ");

        GestorAutenticacion  gestor2 = new GestorAutenticacion(new AutenticacionOAuth());
        gestor2.login("Sharoll", "123");
    }
}

public class PruebaMantenimiento {
    
    public static void main(String[] args) {

        Tecnico tecnico = new Tecnico();
        tecnico.reparar();

        System.out.println(" ");

        PersonalLimpieza limpieza = new PersonalLimpieza();
        limpieza.limpiar();
    }
}

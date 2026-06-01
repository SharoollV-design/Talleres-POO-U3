public class AlmacenamientoNube implements Almacenamiento {
    
    private String dato;

    @Override
    public void guardar(String dato){
        this.dato = dato;
        System.out.println("Guardando en base de datos: " + dato);
    } 

    @Override
    public String recuperar(){
        System.out.println("Recuperando Datos de la nube..");
        return dato;
    }
}

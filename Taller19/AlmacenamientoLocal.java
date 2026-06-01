public class AlmacenamientoLocal implements Almacenamiento {
    
    private String dato;

    @Override
    public void guardar(String dato){
        this.dato = dato;
        System.out.println("Guardando archivo " + dato);
    }

    @Override
    public String recuperar(){
        System.out.println("Recuperando archivo....");
        return dato;
    }

}

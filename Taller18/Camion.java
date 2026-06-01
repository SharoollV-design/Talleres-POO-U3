public class Camion implements Conducible, Transportador {

    @Override
    public void conducir(){
        System.out.println("Se está conduciendo el camión ");
    }

    @Override
    public void cargarMercancia(){
        System.out.println("El camion está cargando mercancia");
    }
    
}

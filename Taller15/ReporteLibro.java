public class ReporteLibro {
    
    public void generarReporte(Libro libro){

        System.out.println(" Reportes del libro ");
        System.out.println("Nombre del titulo: " + libro.getNombre());
        System.out.println("Autor: " + libro.getAutor());
    }
}

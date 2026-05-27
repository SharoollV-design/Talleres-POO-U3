public class PruebaLibro {
    
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("Antes de diciembre","Joana Marcus");
        
        libro1.mostrarInfo();

        System.out.println(" ");

        ReporteLibro reporte = new ReporteLibro();
        reporte.generarReporte(libro1);

        System.out.println(" ");

        LibroDAO dao = new LibroDAO();
        dao.guardarLibro(libro1);

    }

}

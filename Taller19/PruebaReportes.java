public class PruebaReportes {
    
    public static void main(String[] args) {

        System.out.println(" ");
        
        GestorReportes pdf = new GestorReportes(new ReportePDF());
        pdf.generar("Calificaciones 2026");

        System.out.println(" ");

        GestorReportes excel = new GestorReportes(new ReporteExcel());
        excel.generar(" Pagos 2026 ");
    }
}

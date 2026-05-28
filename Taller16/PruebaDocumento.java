public class PruebaDocumento {
    
    public static void main(String[] args) {
        
        Documento doc = new Documento();
        doc.exportarPDF("Contenido del informe");

        System.out.println(" ");

        ExportarWord exword = new ExportarWord();
        exword.exportar("Contenido del informe");

        System.out.println(" ");

        ExportarExcel exxcel = new ExportarExcel();
        exxcel.exportar("Contenido del informe");
    }
}

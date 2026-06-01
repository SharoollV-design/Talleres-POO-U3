public class GestorReportes {
    
    private GeneradorReporte reporte;

    public GestorReportes(GeneradorReporte reporte) {
        this.reporte = reporte;
    }

    public void generar(String contenido){
        reporte.generar(contenido);
    }
}

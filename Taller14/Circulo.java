public class Circulo extends Figura {
    
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        if(radio > 0) {
            this.radio = radio;
        } else {
            System.out.println("El radio no puede ser negativo");
        }
    }

    @Override
    public void calcularArea() {

        double area = (Math.PI * radio * radio);

        System.out.println("El área del circulo es: " + area);
    }
}

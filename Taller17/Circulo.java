public class Circulo extends Figura {

    private double radio; 

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        if(radio > 0){
            this.radio = radio;
        } else {
            System.out.println("El radio debe ser positivo");
        }
    }

    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
}

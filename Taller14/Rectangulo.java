public class Rectangulo extends Figura {
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        if(base > 0) {
            this.base = base;
        } else{
            System.out.println("La base es incorrecta");
        }
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("La altura es incorrecta");
        }
    }

    @Override
    public void calcularArea(){

        double area = base * altura;

        System.out.println("El área del triangulo es: " + area);
    }
}

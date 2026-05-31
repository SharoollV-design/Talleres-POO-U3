public class Rectangulo extends Figura {
    
    private double base;
    private double altura; 

    public Rectangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        if(base > 0){
            this.base = base;
        } else {
            System.out.println("La base debe ser positiva");
        }
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        if(altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("La altura debe ser positiva");
        }
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }
    
}

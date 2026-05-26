public class Rectangulo extends Figura {
    
    private float  base;
    private float altura;

    public Rectangulo(){

    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura =  altura;
    }

    public double getBase(){
        return base;
    }

    public void setBase(float base){
        if(base > 0) {
            this.base = base;
        } else {
            System.out.println("El valor de la base es incorrecta");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("El valor de la base es incorrecta");
        }
    }

    @Override
    public float calcularArea(){
        return base * altura;
    }
}

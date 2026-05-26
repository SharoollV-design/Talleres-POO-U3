public class Triangulo extends Figura {
    
    private float base;
    private float altura;

    public Triangulo(){

    }

    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public float getBase(){
        return base;
    }

    public void setBase(float base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("El valor de la base es incorrecto");
        }
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        if (altura > 0) {
            this.altura = altura;       
        } else {
            System.out.println("El valor de la altura es incorrecto");
        }
    }

    @Override
    public float calcularArea(){
        return base*altura/2;
    }
}

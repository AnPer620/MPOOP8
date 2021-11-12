public class Triangulo extends Poligono{
    private int alfa, beta, gama;
    private float a,b,c;
    private float base, altura;

    public Triangulo(){}
    
    public float getBase(){
        return base;
    }

    public void setBase(float base){
        this.base=base;
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        this.altura=altura;
    }

    @Override
    public double area(){
        return base*altura/2;
    }

    @Override
    public double perimetro(){
        return a+b+c;
    }

    @Override
    public String toString(){
        return "Triangulo{base="+base+" altura="+altura+"}";
    }
}
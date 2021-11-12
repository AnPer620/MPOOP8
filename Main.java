public class Main {
    public static void main(String[] args) {
        System.out.println("#############Clases concretas##########");
        Poligono poligono1 = new Poligono();
        Triangulo triangulo1 = new Triangulo();
        Cuadrilatero cuadrilatero1 = new Cuadrilatero();
        
        System.out.println(poligono1);
        System.out.println(triangulo1);
        System.out.println(cuadrilatero1);
        System.out.println(poligono1.area());
        System.out.println(triangulo1.area());
        System.out.println(cuadrilatero1.area());

        System.out.println("#############Clases abstractas##########");
        //PoligonoA pol = new PoligonoA(); -> no se puede hacer
        TrianguloA triangulo2= new TrianguloA();
        CuadrilateroA cuadrilatero2 = new CuadrilateroA();
        System.out.println(triangulo2);
        System.out.println(cuadrilatero2);
        System.out.println(triangulo2.perimetro());
        System.out.println(cuadrilatero2.perimetro());

        System.out.println("#############Interceces##########");
        //InstrumentoMusical im = new InstrumentoMusical(); 
        //porque es una intefaz
        
        InstrumentoViento iv = new InstrumentoViento();
        Flauta flauta = new Flauta();
        System.out.println(iv);
        System.out.println(flauta);

        System.out.println("#############Atributos en Interceces##########");
        System.out.println("El mes "+Meses.NUEVE+" corresponde a:");
        System.out.println(Meses.NOMBRES_MESES[Meses.NUEVE]);

        System.out.println("El valor de pi es: "+Math.PI);

        //Recordando el casteo
        System.out.println("El valor de pi es: "+(float)Math.PI);
        System.out.println("El valor de pi es: "+(int)Math.PI);
    }
}

public class InstrumentoViento extends Object implements InstrumentoMusical {
    //Por defecto todods los metodos de la interfaz son publicos
    //por lo tanto así deben de ser implementados

    public InstrumentoViento(){}

    @Override
    public void tocar() {
        System.out.println("Tocando instrumento de viento");
    }

    @Override
    public void afinar() {
        System.out.println("Afiando instrumento de viento");
        
    }

    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }
    
    @Override
    public String toString(){
        return "InstrumentoViento{}";
    }        
}

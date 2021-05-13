public class Terreno implements Celula{
    private TipoTerreno tipo;
    private String letra;

    public Terreno(TipoTerreno tipo){
        this.tipo = tipo;

        switch (tipo){
            case AGUA:      this.letra = new String("A");  break;
            case HOSPITAL:  this.letra = new String("H");  break;
            case PARQUE:    this.letra = new String("P");  break;

            default:        this.letra = new String("T"); break;
        }
    }

    public TipoTerreno getTipo(){
        return this.tipo;
    }
}

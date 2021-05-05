public class Terreno extends Celula{
    static final private CategoriaCelula CATEGORIA_PADRAO = CategoriaCelula.TERRENO;
    private TipoTerreno tipo;

    public Terreno(TipoTerreno tipo){
        super(CATEGORIA_PADRAO);
        this.tipo = tipo;

        switch (tipo){
            case AGUA:      super.letra = new String("A");  break;
            case HOSPITAL:  super.letra = new String("H");  break;
            case PARQUE:    super.letra = new String("P");  break;

            default:        super.letra = new String("T"); break;
        }
    }
}

public class Terreno extends Celula{
    static final private CategoriaCelula CATEGORIA_PADRAO = CategoriaCelula.TERRENO;
    private TipoTerreno tipo;

    public Terreno(TipoTerreno tipo){
        super(CATEGORIA_PADRAO);
        this.tipo = tipo;
    }
}

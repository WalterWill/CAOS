public class Celula {
    protected CategoriaCelula categoria;

    public Celula(CategoriaCelula categoria){
        this.categoria = categoria;
    }

    public CategoriaCelula getCategoria(){
        return this.categoria;
    }
}

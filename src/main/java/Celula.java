public class Celula {
    protected CategoriaCelula categoria;
    protected String letra;

    public Celula(CategoriaCelula categoria){
        this.categoria = categoria;
    }

    public CategoriaCelula getCategoria(){
        return this.categoria;
    }

    public String toString(){
        return letra;
    }
}

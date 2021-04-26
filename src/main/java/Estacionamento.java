public class Estacionamento extends Celula{
    static final private CategoriaCelula CATEGORIA_PADRAO = CategoriaCelula.ESTACIONAMENTO;

    private Object vaga;
    private Estado estado;

    public Estacionamento(){
        super(CATEGORIA_PADRAO);
        this.estado = Estado.LIVRE;
    }

    public void estacionar(Object veiculo){
        this.vaga = veiculo;
        this.estado = Estado.OCUPADO;
    }

    public void liberarVaga(){
        this.estado = Estado.LIVRE;
        this.vaga = null;
    }

    public Estado getEstado(){
        return this.estado;
    }
}

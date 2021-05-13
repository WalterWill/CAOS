public class Estacionamento implements Celula{
    static final private CategoriaCelula CATEGORIA_PADRAO = CategoriaCelula.ESTACIONAMENTO;

    private VeiculoPasseio vaga;
    private Estado estado;
    private String letra;

    public Estacionamento(){
        this.estado = Estado.LIVRE;
        this.letra = new String("E");
    }

    public void estacionar(VeiculoPasseio veiculo){
        this.letra = veiculo.getLetra();
        this.vaga = veiculo;
        this.estado = Estado.OCUPADO;
    }

    public void liberarVaga(){
        this.estado = Estado.LIVRE;
        this.vaga = null;
        this.letra = "E";
    }

    public Estado getEstado(){
        return this.estado;
    }

    @Override
    public String getLetra() {
        return this.letra;
    }
}

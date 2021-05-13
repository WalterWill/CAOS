public class VeiculoPasseio {
    private String letra;
    private int[] destino;
    private Sentido sentido;

    public VeiculoPasseio(int i, int j, Sentido sentido){
        destino[0] = i;
        destino[1] = j;
        this.sentido = sentido;
        this.letra = new String("V");
    }

    public void setDestino(int i, int j){
        this.destino[0] = i;
        this.destino[1] = j;
    }


    public void setSentido(Sentido sentido) {
        this.sentido = sentido;
    }

    public Sentido getSentido() {
        return sentido;
    }



    public String getLetra(){
        return this.letra;
    }


}

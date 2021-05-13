public class Ambulancia {
    private String letra;
    private Sentido sentido;

    public Ambulancia(){
        this.letra = new String("A");
        this.sentido = Sentido.CIMA;
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

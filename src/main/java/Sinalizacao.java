public class Sinalizacao implements Celula {
    private Sinal[] permissao;
    private String letra;

    public Sinalizacao(int qntdDeCruzamentos){
        this.permissao = new Sinal[qntdDeCruzamentos];

        for(int i = 0; i < qntdDeCruzamentos; i++){
            permissao[i] = Sinal.PARE;
        }

        this.letra = new String("S");
    }

    public void setPermissao(int index, Sinal sinal){
        this.permissao[index] = sinal;
    }

    public Sinal getPermissao(int index){
        return permissao[index];
    }

    public void bloquear(){
        for (int i = 0; i < permissao.length; i++){
            permissao[i] = Sinal.PARE;
        }
    }

    public void desbloquear(){
        for (int i = 0; i < permissao.length; i++){
            permissao[i] = Sinal.LIVRE;
        }
    }

    @Override
    public String getLetra() {
        return this.letra;
    }
}

public class Sinalizacao {
    private Via[] cruzamento;
    private Sinal[] permissao;

    public Sinalizacao(int qntdDeCruzamentos){
        this.cruzamento = new Via[qntdDeCruzamentos];
        this.permissao = new Sinal[qntdDeCruzamentos];

        for(int i = 0; i < qntdDeCruzamentos; i++){
            permissao[i] = Sinal.PARE;
        }
    }

    public void setCruzamento(int index, Via via){
        this.cruzamento[index] = via;
    }

    public Sinal canGo(Object via){
        for(int i = 0; i < this.cruzamento.length; i++) {
            if (this.cruzamento[i].equals(via)){
                return permissao[i];
            }
        }
        return Sinal.PARE;
    }

    public void setPermissao(int index, Sinal sinal){
        this.permissao[index] = sinal;
    }

    public Sinal getPermissao(int index){
        return permissao[index];
    }
}

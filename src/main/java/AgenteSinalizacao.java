public class AgenteSinalizacao {
    private int[] posicao;
    private int[] posicaoSemaforo;

    public AgenteSinalizacao(int iPosi, int jPosi,int iSema, int jSema){
        this.posicao = new int[2];
        this.posicao[0] = iPosi;
        this.posicao[1] = jPosi;

        this.posicaoSemaforo = new int[2];
        this.posicaoSemaforo[0] = iSema;
        this.posicaoSemaforo[1] = jSema;
    }

    public void verificar(){
        Rua ruaTemp = Main.matriz.getRua(posicao[0]-1, posicao[1]); //Cima
        if(ruaTemp.getAmbulancia() != null){
            Sinalizacao semafaroTemp = Main.matriz.getSemafaro(posicaoSemaforo[0], posicaoSemaforo[1]);
            semafaroTemp.bloquear();
            Main.matriz.setCelula(semafaroTemp, posicaoSemaforo[0], posicaoSemaforo[1] );
        }else{
            ruaTemp = Main.matriz.getRua(posicao[0], posicao[1]+1); //Direita
            if(ruaTemp.getAmbulancia() != null) {
                Sinalizacao semafaroTemp = Main.matriz.getSemafaro(posicaoSemaforo[0], posicaoSemaforo[1]);
                semafaroTemp.bloquear();
                Main.matriz.setCelula(semafaroTemp, posicaoSemaforo[0], posicaoSemaforo[1]);
            }else{
                ruaTemp = Main.matriz.getRua(posicao[0]+1, posicao[1]); //Baixo
                if(ruaTemp.getAmbulancia() != null) {
                    Sinalizacao semafaroTemp = Main.matriz.getSemafaro(posicaoSemaforo[0], posicaoSemaforo[1]);
                    semafaroTemp.bloquear();
                    Main.matriz.setCelula(semafaroTemp, posicaoSemaforo[0], posicaoSemaforo[1]);
                }else{
                    ruaTemp = Main.matriz.getRua(posicao[0], posicao[1]-1); //Esquerda
                    if(ruaTemp.getAmbulancia() != null) {
                        Sinalizacao semafaroTemp = Main.matriz.getSemafaro(posicaoSemaforo[0], posicaoSemaforo[1]);
                        semafaroTemp.bloquear();
                        Main.matriz.setCelula(semafaroTemp, posicaoSemaforo[0], posicaoSemaforo[1]);
                    }else{
                        Sinalizacao semafaroTemp = Main.matriz.getSemafaro(posicaoSemaforo[0], posicaoSemaforo[1]);
                        semafaroTemp.desbloquear();
                        Main.matriz.setCelula(semafaroTemp, posicaoSemaforo[0], posicaoSemaforo[1]);
                    }
                }
            }
        }
    }


}

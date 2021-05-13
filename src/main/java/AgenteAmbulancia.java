public class AgenteAmbulancia {
    private int[] posicao;

    public AgenteAmbulancia(){
        posicao[0] = 0;
        posicao[1] = 0;
    }

    private boolean canGo(Sentido sentido){
        int i = this.posicao[0];
        int j = this.posicao[1];
        switch (sentido){
            case ESQUERDA: j--;   break;
            case BAIXO: i++;   break;
            case DIREITA:   j++;   break;
            case CIMA:  i--;   break;
        }
        if(i < 0 || i >= 20 || j < 0 || j >= 20){
            if(Main.matriz.getCelula(i, j) instanceof Rua)
                return false;
        }
        return true;
    }

    public void percorrerMatriz(int i, int j){
        for (int linha = 0; linha < i; linha++){
            for (int coluna = 0; coluna < j; coluna++){
                //Verificar Hospital
                Terreno terrenoTemp = Main.matriz.getTerreno(posicao[0]-1, posicao[1]); //Cima
                if(terrenoTemp.getTipo() != TipoTerreno.HOSPITAL){
                    terrenoTemp = Main.matriz.getTerreno(posicao[0], posicao[1]+1); //Direita
                    if(terrenoTemp.getTipo() != TipoTerreno.HOSPITAL){
                        terrenoTemp = Main.matriz.getTerreno(posicao[0]+1, posicao[1]); //Baixo
                        if(terrenoTemp.getTipo() != TipoTerreno.HOSPITAL){
                            terrenoTemp = Main.matriz.getTerreno(posicao[0], posicao[1]-1); //Esquerda
                            if(terrenoTemp.getTipo() != TipoTerreno.HOSPITAL){
                                //Verificar Rua
                                if (Main.matriz.tabela[linha][coluna] instanceof Rua){
                                    Rua ruaTemp = (Rua) Main.matriz.getCelula(linha, coluna);
                                    if(!(ruaTemp.isFree())){
                                        Ambulancia ambulanciaTemp = ruaTemp.getAmbulancia();
                                        if(ambulanciaTemp != null){
                                            boolean girando = true;
                                            Sentido sentidoTemp = ambulanciaTemp.getSentido();

                                            while (girando){
                                                ambulanciaTemp.setSentido(sentidoTemp);
                                                switch (sentidoTemp){
                                                    case CIMA:
                                                        if(canGo(sentidoTemp)){
                                                            Rua proximaRua = (Rua) Main.matriz.getCelula(linha - 1, coluna);
                                                            proximaRua.ocuparRua(ambulanciaTemp);
                                                            ruaTemp.desocuparRua(ambulanciaTemp);

                                                            Main.matriz.setCelula(ruaTemp,linha,coluna);    //Rua origem
                                                            Main.matriz.setCelula(ruaTemp,linha - 1,coluna);    //Rua destino
                                                            girando = false;
                                                        }
                                                        else{
                                                            sentidoTemp = Sentido.DIREITA;
                                                        }
                                                        break;

                                                    case DIREITA:
                                                        if(canGo(sentidoTemp)){
                                                            Rua proximaRua = (Rua) Main.matriz.getCelula(linha, coluna + 1);
                                                            proximaRua.ocuparRua(ambulanciaTemp);
                                                            ruaTemp.desocuparRua(ambulanciaTemp);

                                                            Main.matriz.setCelula(ruaTemp,linha,coluna);    //Rua origem
                                                            Main.matriz.setCelula(ruaTemp,linha,coluna + 1);    //Rua destino
                                                            girando = false;
                                                        }
                                                        else{
                                                            sentidoTemp = Sentido.BAIXO;
                                                        };
                                                        break;
                                                    case BAIXO:
                                                        if(canGo(sentidoTemp)){
                                                            Rua proximaRua = (Rua) Main.matriz.getCelula(linha - 1, coluna);
                                                            proximaRua.ocuparRua(ambulanciaTemp);
                                                            ruaTemp.desocuparRua(ambulanciaTemp);

                                                            Main.matriz.setCelula(ruaTemp,linha,coluna);    //Rua origem
                                                            Main.matriz.setCelula(ruaTemp,linha + 1,coluna);    //Rua destino
                                                            girando = false;
                                                        }
                                                        else{
                                                            sentidoTemp = Sentido.ESQUERDA;
                                                        };
                                                        break;

                                                    case ESQUERDA:
                                                        if(canGo(sentidoTemp)){
                                                            Rua proximaRua = (Rua) Main.matriz.getCelula(linha - 1, coluna);
                                                            proximaRua.ocuparRua(ambulanciaTemp);
                                                            ruaTemp.desocuparRua(ambulanciaTemp);

                                                            Main.matriz.setCelula(ruaTemp,linha,coluna);    //Rua origem
                                                            Main.matriz.setCelula(ruaTemp,linha,coluna - 1);    //Rua destino
                                                            girando = false;
                                                        }
                                                        else{
                                                            sentidoTemp = Sentido.CIMA;
                                                        };
                                                        break;
                                                };
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.posicao[1] = coluna;
            }
            this.posicao[0] = linha;
        }
    }
}

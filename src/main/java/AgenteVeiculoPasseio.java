public class AgenteVeiculoPasseio {

    private int[] posicao;

    public AgenteVeiculoPasseio(){
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
                if (Main.matriz.tabela[linha][coluna] instanceof Rua){
                    Rua ruaTemp = (Rua) Main.matriz.getCelula(linha, coluna);
                    if(!(ruaTemp.isFree())){
                        VeiculoPasseio veiculoTemp = ruaTemp.getVeiculoPesseio();
                        if(veiculoTemp != null){
                            boolean girando = true;
                            Sentido sentidoTemp = veiculoTemp.getSentido();

                            //Verificar Sinalização
                            switch (sentidoTemp){
                                case CIMA:
                                    if(Main.matriz.getCelula(linha - 1, coluna - 1) instanceof Sinalizacao){
                                        Sinalizacao sinalTemp = (Sinalizacao) Main.matriz.getCelula(linha - 1, coluna - 1);
                                        if(sinalTemp.getPermissao(ruaTemp.getId()) == Sinal.LIVRE){
                                            while (girando){
                                                veiculoTemp.setSentido(sentidoTemp);
                                                switch (sentidoTemp){
                                                    case CIMA:
                                                        if(canGo(sentidoTemp)){
                                                            Rua proximaRua = (Rua) Main.matriz.getCelula(linha - 1, coluna);
                                                            proximaRua.ocuparRua(veiculoTemp);
                                                            ruaTemp.desocuparRua(veiculoTemp);

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
                                                            proximaRua.ocuparRua(veiculoTemp);
                                                            ruaTemp.desocuparRua(veiculoTemp);

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
                                                            proximaRua.ocuparRua(veiculoTemp);
                                                            ruaTemp.desocuparRua(veiculoTemp);

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
                                                            proximaRua.ocuparRua(veiculoTemp);
                                                            ruaTemp.desocuparRua(veiculoTemp);

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
                                    }else {
                                        if(Main.matriz.getCelula(linha - 1, coluna + 1) instanceof Sinalizacao){
                                            Sinalizacao sinalTemp = (Sinalizacao) Main.matriz.getCelula(linha - 1, coluna + 1);
                                            if(sinalTemp.getPermissao(ruaTemp.getId()) == Sinal.LIVRE){
                                                while (girando){
                                                    veiculoTemp.setSentido(sentidoTemp);
                                                    switch (sentidoTemp){
                                                        case CIMA:
                                                            if(canGo(sentidoTemp)){
                                                                Rua proximaRua = (Rua) Main.matriz.getCelula(linha - 1, coluna);
                                                                proximaRua.ocuparRua(veiculoTemp);
                                                                ruaTemp.desocuparRua(veiculoTemp);

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
                                                                proximaRua.ocuparRua(veiculoTemp);
                                                                ruaTemp.desocuparRua(veiculoTemp);

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
                                                                proximaRua.ocuparRua(veiculoTemp);
                                                                ruaTemp.desocuparRua(veiculoTemp);

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
                                                                proximaRua.ocuparRua(veiculoTemp);
                                                                ruaTemp.desocuparRua(veiculoTemp);

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
                                    };
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

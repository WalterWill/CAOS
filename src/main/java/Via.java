import java.util.List;

public class Via {
    final int ARRAY_SIZE = 3;
    private int[] destino;

    public Via(int i, int j, int indexVia){
        destino = new int[ARRAY_SIZE];
        destino[0] = i; //Linha
        destino[1] = j; //Coluna
        destino[2] = indexVia;
    }

    public int getLinha(){
        return destino[0];
    }

    public int getColuna(){
        return destino[1];
    }

    public int getIndexVia(){
        return destino[2];
    }

    public int[] getDestino(){
        return this.destino;
    }
}

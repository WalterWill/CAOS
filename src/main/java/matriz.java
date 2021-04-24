import java.util.List;

public class matriz {
    private List<Object>[][] tabela;
    public matriz(int i, int j){
        tabela = new List[i][j];
    }

    public int getSize(){
        int count = 0;
        for (int i = 0; i < tabela.length; i++){
            count += tabela[i].length;
        }
        return count;
    }
}

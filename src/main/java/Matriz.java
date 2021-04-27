import java.util.List;

public class Matriz {
    private Object[][] tabela;
    public Matriz(int i, int j){
        tabela = new Object[i][j];
    }

    public int getSize(){
        int count = 0;
        for (int i = 0; i < tabela.length; i++){
            count += tabela[i].length;
        }
        return count;
    }

    public void setCelula(Object celula, int i, int j){
        tabela[i][j] = celula;
    }

    public Object getCelula(int i, int j){
        return tabela[i][j];
    }
}

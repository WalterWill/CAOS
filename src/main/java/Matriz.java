import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

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

    public void printMatriz() throws IOException, InterruptedException {
        clearScreen();
        for (int i = 0; i < tabela.length; i++){
            for (int j = 0; j < tabela.length; j++){
                System.out.print(tabela[i][j]);
            }
            System.out.println("");
        }
    }

    public void clearScreen()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}


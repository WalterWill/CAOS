import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Matriz {
    public Celula[][] tabela;
    public Matriz(int i, int j){
        tabela = new Celula[i][j];
    }

    public int getSize(){
        int count = 0;
        for (int i = 0; i < tabela.length; i++){
            count += tabela[i].length;
        }
        return count;
    }

    public void setCelula(Celula celula, int i, int j){
        tabela[i][j] = celula;
    }

    public Object getCelula(int i, int j){
        return tabela[i][j];
    }

    public Rua getRua(int i, int j){
        if(tabela[i][j] instanceof Rua){
            return (Rua) tabela[i][j];
        }
        return null;
    }

    public Sinalizacao getSemafaro(int i, int j){
        if(tabela[i][j] instanceof Sinalizacao){
            return (Sinalizacao) tabela[i][j];
        }
        return null;
    }

    public Terreno getTerreno(int i, int j){
        if(tabela[i][j] instanceof Terreno){
            return (Terreno) tabela[i][j];
        }
        return null;
    }

    public void printMatriz() throws IOException, InterruptedException {
        System.out.println( ConsoleColors.RED + ConsoleColors.GREEN_BACKGROUND + "RED COLORED" +
                ConsoleColors.RESET + " NORMAL");
        for (int i = 0; i < tabela.length; i++){
            for (int j = 0; j < tabela.length; j++){
                System.out.print( tabela[i][j]);
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


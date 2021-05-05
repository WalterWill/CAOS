import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class MatrizTest {
    @Test
    public void deveInstanciarMatrizQuandoInformadoTamanho(){
        Matriz m = new Matriz(10,10);

        int valorEsperado = 100;
        int valorRecebido = m.getSize();

        Assert.assertEquals(valorEsperado, valorRecebido);
    }

    @Test
    public void deveRetornarObjetoQuandoRequisitado(){
        Matriz m = new Matriz(10,10);
        Object r = new Rua(2);
        m.setCelula(r,1,1);

        Object valorRecebido = m.getCelula(1,1);

        Assert.assertEquals(r, valorRecebido);
    }

    @Test
    public void deveRetornarVazioQuandoCelulaEstiverVazia(){
        Matriz m = new Matriz(10, 10);

        Object valorRecebido = m.getCelula(1,1);

        Assert.assertNull(valorRecebido);
    }

    @Test
    public void devePrintarMatrizQuandoRequisitado() {
        Matriz m = new Matriz(2,2);
        Rua r = new Rua(1);

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                m.setCelula(r, i, j);
            }
        }

        try {
            m.printMatriz();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}

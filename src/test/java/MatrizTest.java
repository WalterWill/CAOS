import org.junit.Assert;
import org.junit.Test;

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
        m.addCelula(r,1,1);

        Object valorRecebido = m.getCelula(1,1);

        Assert.assertEquals(r, valorRecebido);
    }

    @Test
    public void deveRetornarVazioQuandoCelulaEstiverVazia(){
        Matriz m = new Matriz(10, 10);

        Object valorRecebido = m.getCelula(1,1);

        Assert.assertNull(valorRecebido);
    }

}

import org.junit.Assert;
import org.junit.Test;

public class matrizTest {
    @Test
    public void deveInstanciarMatrizQuandoInformadoTamanho(){
        matriz m = new matriz(10,10);

        int valorEsperado = 100;
        int valorRecebido = m.getSize();

        Assert.assertEquals(valorEsperado, valorRecebido);
    }


}

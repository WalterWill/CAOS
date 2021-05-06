import org.junit.Assert;
import org.junit.Test;

public class ViaTest {
    @Test
    public void deveInstanciarViaQuandoRequisitado(){
        Via v = new Via(0,1,0);

        int linhaEsperada = 0;
        int colunaEsperada = 1;
        int indexEsperado = 0;
        int linhaRecebida = v.getLinha();
        int colunaRecebida = v.getColuna();
        int indexRecebido = v.getIndexVia();

        Assert.assertEquals(linhaEsperada, linhaRecebida);
        Assert.assertEquals(colunaEsperada, colunaRecebida);
        Assert.assertEquals(indexEsperado, indexRecebido);
    }
}

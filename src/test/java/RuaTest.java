import org.junit.Assert;
import org.junit.Test;

public class RuaTest {
    @Test

    public void deveCriarViasQuandoInformado(){
        Rua r = new Rua(2);

        Assert.assertTrue(r.isFree(0));
        Assert.assertTrue(r.isFree(1));
    }

    @Test
    public void deveRetornarTipoCelulaQuandoRequisitado(){
        Rua r = new Rua(2);

        CategoriaCelula valorEsperado = CategoriaCelula.RUA;
        CategoriaCelula valorRecebido = r.getCategoria();

        Assert.assertEquals(valorEsperado, valorRecebido);
    }
}
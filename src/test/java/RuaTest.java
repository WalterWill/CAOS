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

    @Test
    public void deveOcuparViaQuandoInserirVeiculo(){
        Rua r = new Rua(1);
        Object veiculo = new Object();
        r.ocuparVia(veiculo, 0);

        Assert.assertFalse(r.isFree(0));
    }

    @Test
    public void deveDesocuparViaQuandoRemoverVeiculo() {
        Rua r = new Rua(1);
        Object veiculo = new Object();
        r.ocuparVia(veiculo, 0);
        r.desocuparVia(0);

        Assert.assertTrue(r.isFree(0));
    }

    @Test
    public void deveAdicionarViaQuandoSolicitado(){
        Via v = new Via(0,0,0);
        Rua r = new Rua(2);
        r.setVia(0,v);

        Object objetoRecebido = r.getVia(0);
        Object objetoEsperado = v;

        Assert.assertEquals(objetoEsperado, objetoRecebido);
    }
}
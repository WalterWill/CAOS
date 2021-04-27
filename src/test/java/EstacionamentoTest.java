import org.junit.Assert;
import org.junit.Test;

public class EstacionamentoTest {
    @Test
    public void deveRetornarLivreQuandoInstanciado(){
        Estacionamento e = new Estacionamento();

        Estado valorEsperado = Estado.LIVRE;
        Estado valorRecebido = e.getEstado();

        Assert.assertEquals(valorEsperado, valorRecebido);
    }

    @Test
    public void deveRetornarOcupadoQuandoEstiverEstacionado(){
        Estacionamento e = new Estacionamento();
        Object a = new Object();
        e.estacionar(a);

        Estado valorEsperado = Estado.OCUPADO;
        Estado valorRecebido = e.getEstado();

        Assert.assertEquals(valorEsperado, valorRecebido);
    }

    @Test
    public void deveDesocuparVagaQuandoRequisitado(){
        Estacionamento e = new Estacionamento();
        Object a = new Object();
        e.estacionar(a);
        e.liberarVaga();

        Estado valorEsperado = Estado.LIVRE;
        Estado valorRecebido = e.getEstado();

        Assert.assertEquals(valorEsperado, valorRecebido);
    }
}

import org.junit.Assert;
import org.junit.Test;

public class SinalizacaoTest {
    @Test
    public void deveRetornarSinalPareQuandoInformadoVia(){
        Rua r1 = new Rua(1);
        Via v1 = new Via(0,2,0);
        r1.setVia(0,v1);

        Sinalizacao s1 = new Sinalizacao(1);
        s1.setCruzamento(0,v1);

        Object objetoEsperado = Sinal.PARE;
        Object objetoRecebido = s1.canGo(r1.getVia(0));

        Assert.assertEquals(objetoEsperado, objetoRecebido);
    }

    @Test
    public void deveAlterarEstadoQuandoSolicitado(){
        Rua r1 = new Rua(1);
        Via v1 = new Via(0,2,0);
        r1.setVia(0,v1);

        Sinalizacao s1 = new Sinalizacao(1);
        s1.setCruzamento(0,v1);
        s1.setPermissao(0, Sinal.LIVRE);

        Object objetoEsperado = Sinal.LIVRE;
        Object objetoRecebido = s1.getPermissao(0);

        Assert.assertEquals(objetoEsperado, objetoRecebido);
    }
}

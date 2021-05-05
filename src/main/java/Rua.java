import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rua extends Celula{
    private List<Object> via;
    final private Estado VIA_VAZIA = Estado.LIVRE;
    static final private CategoriaCelula CATEGORIA_PADRAO = CategoriaCelula.RUA;
    static final private String LETRA_PADRAO = new String("R");

    public Rua(int n){
        super(CATEGORIA_PADRAO);
        super.letra = LETRA_PADRAO;
        via = new ArrayList<Object>();
        for (int i = 0; i < n; i++){
            via.add(i, VIA_VAZIA);
        }
    }

    public boolean isFree(int n){
        if (via.get(n).equals(VIA_VAZIA)){
            return true;
        }
        return false;
    }

    public void ocuparVia(Object veiculo, int via){
        this.via.set(via, veiculo);
    }

    public void desocuparVia(int via){
        this.via.set(via, VIA_VAZIA);
    }


}

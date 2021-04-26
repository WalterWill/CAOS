import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rua extends Celula{
    private List<Object> via;
    final private Estado VIA_VAZIA = Estado.LIVRE;
    final private CategoriaCelula CATEGORIA_PADRAO = CategoriaCelula.RUA;

    public Rua(int n){
        super(CategoriaCelula.RUA);
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
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rua implements Celula{
    private Estado estado;
    private CategoriaCelula CATEGORIA_PADRAO = CategoriaCelula.RUA;
    private String letra;
    private VeiculoPasseio veiculoPesseio;
    private Ambulancia ambulancia;
    private int id;

    public Rua(){
        this.letra = new String("R");
        this.estado = Estado.LIVRE;
        this.id = -1;
    }

    public Rua(int id){
        this.letra = new String("R");
        this.estado = Estado.LIVRE;
        this.id = id;
    }

    public boolean isFree(){
        if (estado.equals(Estado.LIVRE)){
            return true;
        }
        return false;
    }

    public void ocuparRua(VeiculoPasseio veiculo){
        this.veiculoPesseio = veiculo;
        this.letra = veiculo.getLetra();
        estado = Estado.OCUPADO;
    }

    public void ocuparRua(Ambulancia ambulancia){
        this.ambulancia = ambulancia;
        this.letra = ambulancia.getLetra();
        this.estado = Estado.OCUPADO;
    }

    public void desocuparRua(VeiculoPasseio veiculoPesseio){
        this.letra = "R";
        this.veiculoPesseio = null;
        estado = Estado.LIVRE;
    }

    public void desocuparRua(Ambulancia ambulancia){
        this.letra = "R";
        this.ambulancia = null;
        estado = Estado.LIVRE;
    }

    public VeiculoPasseio getVeiculoPesseio(){
        if(veiculoPesseio != null){
            return this.veiculoPesseio;
        }
        return null;
    }

    public Ambulancia getAmbulancia(){
        if(ambulancia != null){
            return this.ambulancia;
        }
        return null;
    }

    public void setAmbulancia(Ambulancia ambulancia) {
        this.ambulancia = ambulancia;
    }

    public int getId() {
        return id;
    }
}

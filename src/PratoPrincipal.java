import java.util.ArrayList;
import java.util.List;

public class PratoPrincipal extends Item{
    private List<String> ingredientes;
    private String descricao;
    private int tempoDePreparo;

    public PratoPrincipal(String nome, String codigo, double precprecoUnitarioVenda, double precoUnicatarioCusto,  List<String> ingredientes,String descricao, int tempoDePreparo){
        super(nome, codigo, precprecoUnitarioVenda, precoUnicatarioCusto );
        this.ingredientes = new ArrayList<>(ingredientes);
        this.descricao = descricao;
        this.tempoDePreparo = tempoDePreparo;

    }


    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(int tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }
}

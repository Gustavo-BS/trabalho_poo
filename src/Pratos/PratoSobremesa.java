package Pratos;

import Pratos.Item;

import java.io.Serializable;
import java.util.List;

public class PratoSobremesa extends Item implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<String> ingredientes;
    private String descricao;
    private int tempoDePreparo; // Corrigido o nome do parâmetro
    private int calorias;

    public PratoSobremesa(String nome, String codigo, double precoUnitarioVenda, double precoUnitarioCusto,
    List<String> ingredientes, String descricao, int tempoDePreparo, int calorias) { // Corrigido o nome do parâmetro
        super(nome, codigo, precoUnitarioVenda, precoUnitarioCusto);
        this.ingredientes = ingredientes;
        this.descricao = descricao;
        this.tempoDePreparo = tempoDePreparo;
        this.calorias = calorias;
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

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}

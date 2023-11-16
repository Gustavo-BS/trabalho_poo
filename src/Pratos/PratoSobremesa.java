package Pratos;

import Pratos.Item;

import java.util.List;

public class PratoSobremesa extends Item {
    private List<String> ingredientes;
    private String descricao;
    private int tempoPreparo;
    private int calorias;

    public PratoSobremesa(String nome, String codigo, double precprecoUnitarioVenda, double precoUnicatarioCusto,  List<String> ingredientes,String descricao, int tempoDePreparo, int calorias){
        super(nome, codigo, precprecoUnitarioVenda, precoUnicatarioCusto );
        this.ingredientes = ingredientes;
        this.descricao = descricao;
        this.tempoPreparo = tempoDePreparo;
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

package Pratos;

import java.io.Serializable;

import Pratos.Item;

public class Bebidas extends Item implements Serializable {
    private static final long serialVersionUID = 1L;
    private int tamanho;
    private TipoEmbalagem tipoEmbalagem;

    public Bebidas(String nome, String codigo, double precoUnitarioVenda, double precoUnitarioCusto,
                   int tamanho, TipoEmbalagem tipoEmbalagem) {
        super(nome, codigo, precoUnitarioVenda, precoUnitarioCusto);
        this.tamanho = tamanho;
        this.tipoEmbalagem = tipoEmbalagem;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public TipoEmbalagem getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(TipoEmbalagem tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }
}

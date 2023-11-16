package Pratos;

public abstract class Item {
    private String nome;
    private String codigo;
    private double precoUnitarioVenda;
    private double precoUnicatarioCusto;

    public Item(String nome, String codigo, double precoUnitarioVenda, double precoUnicatarioCusto) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoUnitarioVenda = precoUnitarioVenda;
        this.precoUnicatarioCusto = precoUnicatarioCusto;
    }


}

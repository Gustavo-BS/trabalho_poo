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


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecoUnitarioVenda() {
        return precoUnitarioVenda;
    }

    public void setPrecoUnitarioVenda(double precoUnitarioVenda) {
        this.precoUnitarioVenda = precoUnitarioVenda;
    }

    public double getPrecoUnicatarioCusto() {
        return precoUnicatarioCusto;
    }

    public void setPrecoUnicatarioCusto(double precoUnicatarioCusto) {
        this.precoUnicatarioCusto = precoUnicatarioCusto;
    }
}

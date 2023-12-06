package Funcionarios;

import java.io.Serializable;

public class Cozinheiro extends Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;
    private int pratosPreparados;

    public Cozinheiro(String nome, String CPF, EstadoCivil estadoCivil, double salarioBase) {
        super(nome, CPF, estadoCivil, salarioBase);
        this.pratosPreparados = 0;
    }

    public void adicionarPratoPreparado() {
        this.pratosPreparados++;
    }

    public boolean isPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(boolean pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public boolean isSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(boolean sobremesa) {
        this.sobremesa = sobremesa;
    }
   
   public double calcularSalario(double totalVendas, double salarioBase) {
        double comissao = totalVendas * 0.05;
        return salarioBase + comissao;
    }
}

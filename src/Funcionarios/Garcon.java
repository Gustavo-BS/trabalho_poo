package Funcionarios;

import java.io.Serializable;
import java.util.Date;

import java.io.Serializable;

public class Garcon extends Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;
    private Date admissao;
    private String carteiraTrabalho;
    private double salarioBase;
    private DiaFolga diaFolga;
    private int numeroPedidos;

    public Garcon(String nome, String CPF, EstadoCivil estadoCivil) {
        super(nome, CPF, estadoCivil);
        this.admissao = null;
        this.carteiraTrabalho = "";
        this.salarioBase = 0.0;
        this.diaFolga = null;
        this.numeroPedidos = 0;
    }

    @Override
   public double calcularSalario(double totalVendas, double salarioBase) {
        // Cálculo específico para o Garçom: 10% do total de vendas
        double comissao = totalVendas * 0.10;
        return salarioBase + comissao;
    }
}

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

    public Garcon(String nome, String CPF) {
        super(nome, CPF, estadocivil);
        this.admissao = null; // Valor inicial para admissao
        this.carteiraTrabalho = ""; // Valor inicial para carteiraTrabalho
        this.salarioBase = 0.0; // Valor inicial para salarioBase
        this.diaFolga = null; // Valor inicial para diaFolga
        this.numeroPedidos = 0; // Valor inicial para numeroPedidos
    }

    @Override
   public double calcularSalario(double totalVendas, double salarioBase) {
        double comissao = totalVendas * 0.10;
        return salarioBase + comissao;
    }
}

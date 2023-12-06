package Funcionarios;

import java.io.Serializable;
import java.util.Date;

public class Garcon extends Funcionario implements Serializable{
    private static final long serialVersionUID = 1L;
    private Date admissao;
    private String carteiraTrabalho;
    private double salarioBase;
    private DiaFolga diaFolga;
    private int numeroPedidos;

    public Garcon(String nome, String CPF){
        super(nome,CPF);
        // this.admissao = admissao;
        // this.carteiraTrabalho = carteiraTrabalho;
        // this.salarioBase = salarioBase;
        // this.diaFolga = diaFolga;
    }

    public void adicionarPedidoRealizado() {
        this.numeroPedidos++;
    }

    @Override
    public double calcularSalario() {
        double salarioTotal = getSalario();
        if (numeroPedidos > 100) {
            salarioTotal += 100; // Bônus fixo se o número de pedidos for maior que 100
        }
        return salarioTotal;
    }
}

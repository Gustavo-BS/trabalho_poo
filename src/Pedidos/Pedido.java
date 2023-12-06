package Pedidos;



import Funcionarios.Cozinheiro;
import Funcionarios.Funcionario;
import Funcionarios.Garcon;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<ItemPedido> itens;
    private LocalDate data;
    private LocalTime horarioRegistro;
    private FormaPagamento formaPagamento;
    private Cozinheiro preparou;
    private Garcon atendeu;

    public Pedido(LocalDate data, LocalTime horarioRegistro, Garcon atendeu, Cozinheiro preparou, FormaPagamento formaPagamento) {
        this.data = data;
        this.horarioRegistro = horarioRegistro;
        this.atendeu = atendeu;
        this.preparou = preparou;
        this.formaPagamento = formaPagamento;
        this.itens = new ArrayList<>();
    }

    @Override
    public String toString() {
        String s = "Data: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nHorario: "
                + (horarioRegisto.format(DateTimeFormatter.ofPattern("HH:mm")));
        s += "\nForma de pagamento: " + formaPagamento;
        s += "\nCozinheiro: " + preparou.getNome();
        s += "\nGarçom: " + atendeu.getNome();
        return s;
    }

    public double soma() {
        double total = 0.0;

        for (ItemPedido itemPedido : itens) {
            total += itemPedido.getTotal();
        }

        return total;
    }
    
    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
    }

    public void calcularSalarioFuncionarios(CalculoSalario calculoSalario, double totalVendas) {
        double salarioFinalGarcom = calculoSalario.calcularSalario(totalVendas, atendeu.getSalarioBase());
        double salarioFinalCozinheiro = calculoSalario.calcularSalario(totalVendas, preparou.getSalarioBase());

        System.out.println("Salário final do Garçom (" + atendeu.getNome() + "): " + salarioFinalGarcom);
        System.out.println("Salário final do Cozinheiro (" + preparou.getNome() + "): " + salarioFinalCozinheiro);
    }

}

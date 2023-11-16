package Pedidos;



import Funcionarios.Cozinheiro;
import Funcionarios.Funcionario;
import Funcionarios.Garcon;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;
    private LocalDate data;
    private LocalTime horarioRegisto;
    private LocalTime horarioPagamento;
    private FormaPagamento formaPagamento;
    private Cozinheiro preparou;
    private Garcon atendeu;


    private double soma;

    public Pedido(Cozinheiro preparou, Garcon atendeu, LocalDate data, LocalTime horarioRegisto) {
        this.itens = new ArrayList<>();
        this.data = data;
        this.horarioRegisto = horarioRegisto;
        this.horarioPagamento = null;
        this.formaPagamento = null;
        this.preparou = preparou;
        this.atendeu = atendeu;

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

}

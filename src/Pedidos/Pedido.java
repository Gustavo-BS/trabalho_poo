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

public class Pedido implements Serializable{
    private static final long serialVersionUID = 1L;
    private List<ItemPedido> itens;
    private LocalDate data;
    private LocalTime horarioRegisto;
    private LocalTime horarioPagamento;
    private FormaPagamento formaPagamento;
    private Cozinheiro preparou;
    private Garcon atendeu;
    private LocalTime horarioRegistro;

    private double soma;

    public Pedido(LocalDate data, LocalTime horarioRegistro, Garcom atendeu, Cozinheiro preparou) {
        this.data = data;
        this.horarioRegistro = horarioRegistro;
        this.atendeu = atendeu;
        this.preparou = preparou;
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

}

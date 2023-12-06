package Pedidos;

import Pratos.Item;

public class ItemPedido {
    private static final long serialVersionUID = 1L;
    private Item item;
    private int quantidade;

    public ItemPedido(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return item.getPrecoUnitarioVenda() * quantidade;
    }
}
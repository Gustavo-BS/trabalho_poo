import Funcionarios.Cozinheiro;
import Funcionarios.Garcon;
import Pedidos.Pedido;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalTime horarioRegistro;
        LocalDate data;

        Cozinheiro c = new Cozinheiro("Joao", "00281687048", true, true);
        Garcon g = new Garcon("Mario", "69419943046");
        data = LocalDate.now();
        horarioRegistro = LocalTime.now();
        Pedido p = new Pedido(c, g, data, horarioRegistro);
        System.out.println(p);
    }
}

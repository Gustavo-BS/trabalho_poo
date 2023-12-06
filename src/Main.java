import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Funcionarios.Cozinheiro;
import Funcionarios.Funcionario;
import Pedidos.Pedido;

public class Main{
    private static final String PRATOS_FILE = "pratos.ser";
    private static final String FUNCIONARIOS_FILE = "funcionarios.ser";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Prato> pratos = carregarPratos();
        List<Funcionario> funcionarios = carregarFuncionarios();

        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarPrato(scanner, pratos);
                    break;
                case 2:
                    cadastrarFuncionario(scanner, funcionarios);
                    break;
                case 3:
                    exibirPratos(pratos);
                    break;
                case 4:
                    exibirFuncionarios(funcionarios);
                    break;
                case 5:
                    salvarPratos(pratos);
                    salvarFuncionarios(funcionarios);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n--- Restaurante App ---");
        System.out.println("1. Cadastrar Prato");
        System.out.println("2. Cadastrar Funcionário");
        System.out.println("3. Exibir Pratos");
        System.out.println("4. Exibir Funcionários");
        System.out.println("5. Salvar Dados");
        System.out.println("0. Sair");
    }

    private static void cadastrarPrato(Scanner scanner, List<Prato> pratos) {
        // Implemente a lógica para cadastrar um prato
    }

    private static void cadastrarFuncionario(Scanner scanner, List<Funcionario> funcionarios) {
        // Implemente a lógica para cadastrar um funcionário
    }

    private static void exibirPratos(List<Prato> pratos) {
        // Implemente a lógica para exibir os pratos cadastrados
    }

    private static void exibirFuncionarios(List<Funcionario> funcionarios) {
        // Implemente a lógica para exibir os funcionários cadastrados
    }

    private static List<Prato> carregarPratos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PRATOS_FILE))) {
            return (List<Prato>) ois.readObject();
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            return new ArrayList<>();
        }
    }

    private static List<Funcionario> carregarFuncionarios() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FUNCIONARIOS_FILE))) {
            return (List<Funcionario>) ois.readObject();
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            return new ArrayList<>();
        }
    }

    private static void salvarPratos(List<Prato> pratos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PRATOS_FILE))) {
            oos.writeObject(pratos);
            System.out.println("Pratos salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os pratos: " + e.getMessage());
        }
    }

    private static void salvarFuncionarios(List<Funcionario> funcionarios) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FUNCIONARIOS_FILE))) {
            oos.writeObject(funcionarios);
            System.out.println("Funcionários salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os funcionários: " + e.getMessage());
        }
    }
}

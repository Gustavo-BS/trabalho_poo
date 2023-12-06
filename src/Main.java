


import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Funcionarios.Cozinheiro;
import Funcionarios.Funcionario;
import Pedidos.Pedido;

public class Main {
    private static List<Pedido> pedidos = new ArrayList<>();
    private static List<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("== Sistema de Restaurante ==");
            System.out.println("1. Realizar pedido");
            System.out.println("2. Adicionar funcionário");
            System.out.println("3. Salvar dados");
            System.out.println("4. Carregar dados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    realizarPedido(scanner);
                    break;
                case 2:
                    adicionarFuncionario(scanner);
                    break;
                case 3:
                    salvarDados();
                    break;
                case 4:
                    carregarDados();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
    private static void salvarDados() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("dados.bin"))) {
            out.writeObject(pedidos);
            out.writeObject(funcionarios);
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    private static void carregarDados() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("dados.bin"))) {
            pedidos = (List<Pedido>) in.readObject();
            funcionarios = (List<Funcionario>) in.readObject();
            System.out.println("Dados carregados com sucesso!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }
    }

    private static void realizarPedido(Scanner scanner) {
        System.out.println("== Realizar Pedido ==");
        System.out.println("Selecione o tipo de funcionário que preparou o pedido:");
        System.out.println("1. Cozinheiro");
        System.out.println("2. Outro");
        int opcaoFuncionario = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Funcionario funcionario;
        if (opcaoFuncionario == 1) {
            funcionario = criarCozinheiro(scanner);
        } else {
            funcionario = criarFuncionario(scanner);
        }

        System.out.println("Digite a data do pedido (formato: yyyy-MM-dd):");
        LocalDate dataPedido = LocalDate.parse(scanner.nextLine());

        System.out.println("Digite o horário do pedido (formato: HH:mm:ss):");
        LocalTime horarioPedido = LocalTime.parse(scanner.nextLine());

        Pedido pedido = new Pedido(funcionario, dataPedido, horarioPedido);
        pedidos.add(pedido);

        System.out.println("Pedido realizado com sucesso!");
    }

    private static Cozinheiro criarCozinheiro(Scanner scanner) {
        // Lógica para criar um cozinheiro
        System.out.println("Digite o nome do cozinheiro:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do cozinheiro:");
        String cpf = scanner.nextLine();

        return new Cozinheiro(nome, cpf);
    }

    private static Funcionario criarFuncionario(Scanner scanner) {
        // Lógica para criar um funcionário genérico
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do funcionário:");
        String cpf = scanner.nextLine();

        return new Funcionario(nome, cpf);
    }

    private static void adicionarFuncionario(Scanner scanner) {
        System.out.println("== Adicionar Funcionário ==");
        System.out.println("Selecione o tipo de funcionário a ser adicionado:");
        System.out.println("1. Cozinheiro");
        System.out.println("2. Outro");
        int opcaoFuncionario = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Funcionario novoFuncionario;
        if (opcaoFuncionario == 1) {
            novoFuncionario = criarCozinheiro(scanner);
        } else {
            novoFuncionario = criarFuncionario(scanner);
        }

        funcionarios.add(novoFuncionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }
}
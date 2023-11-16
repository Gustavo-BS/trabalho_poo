package Funcionarios;

public abstract class Funcionario {
    private String nome;
    private String CPF;
    private String RG;
    private EstadoCivil estadoCivil;
    private String endereco;


    public Funcionario(String nome, String CPF, String RG, EstadoCivil estadoCivil, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
    }
}

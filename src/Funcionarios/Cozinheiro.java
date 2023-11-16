package Funcionarios;

public class Cozinheiro extends Funcionario{
    private boolean pratoPrincipal;
    private boolean sobremesa;

    public Cozinheiro(String nome, String CPF, String RG, EstadoCivil estadoCivil, String endereco, boolean pratoPrincipal, boolean sobremesa){
        super(nome, CPF, RG, estadoCivil, endereco);
        this.pratoPrincipal = pratoPrincipal;
        this.sobremesa = sobremesa;
    }
}

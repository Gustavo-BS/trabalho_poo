package Funcionarios;

import java.util.Date;

public class Garcon extends Funcionario{
    private Date admissao;
    private String carteiraTrabalho;
    private double salarioBase;
    private DiaFolga diaFolga;

    public Garcon(String nome, String CPF, String RG, EstadoCivil estadoCivil, String endereco, Date admissao, String carteiraTrabalho, double salarioBase, DiaFolga diaFolga){
        super(nome,CPF,RG,estadoCivil,endereco);
        this.admissao = admissao;
        this.carteiraTrabalho = carteiraTrabalho;
        this.salarioBase = salarioBase;
        this.diaFolga = diaFolga;
    }
}

package Funcionarios;

import java.util.Date;

public class Garcon extends Funcionario{
    private Date admissao;
    private String carteiraTrabalho;
    private double salarioBase;
    private DiaFolga diaFolga;

    public Garcon(String nome, String CPF){
        super(nome,CPF);
        this.admissao = admissao;
        this.carteiraTrabalho = carteiraTrabalho;
        this.salarioBase = salarioBase;
        this.diaFolga = diaFolga;
    }
}

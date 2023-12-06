package Funcionarios;

import java.io.Serializable;

public class Cozinheiro extends Funcionario implements Serializable{
    private static final long serialVersionUID = 1L;
    private boolean pratoPrincipal;
    private boolean sobremesa;
    private int pratosPreparados;
    

    public Cozinheiro(String nome, String CPF, boolean pratoPrincipal, boolean sobremesa){
        super(nome, CPF);
        this.pratoPrincipal = pratoPrincipal;
        this.sobremesa = sobremesa;
        this.pratosPreparados = 0;
    }

    public void adicionarPratoPreparado() {
        this.pratosPreparados++;
    }

    public boolean isPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(boolean pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public boolean isSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(boolean sobremesa) {
        this.sobremesa = sobremesa;
    }
   
    @Override
    public double calcularSalario() {
        return getSalario() + pratosPreparados * 5; // Pagamento por prato preparado (R$ 5 por prato)
    }
}

package Funcionarios;

public class Cozinheiro extends Funcionario{
    private boolean pratoPrincipal;
    private boolean sobremesa;

    public Cozinheiro(String nome, String CPF, boolean pratoPrincipal, boolean sobremesa){
        super(nome, CPF);
        this.pratoPrincipal = pratoPrincipal;
        this.sobremesa = sobremesa;
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


}

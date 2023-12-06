package Funcionarios;

import java.io.Serializable;
import java.util.regex.Pattern;

public abstract class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String CPF;
    private EstadoCivil estadoCivil;
    private double salario;
    private String cargo;

    public Funcionario(){

    }
    
    public Funcionario(String nome, String CPF) {
        this.nome = nome;
        validarCPF(CPF);
        this.CPF = CPF;
    }

    private void validarCPF(String CPF) {
        if (!CPFValido(CPF)) {
            throw new CPFException("CPF INVALIDO: " + CPF);
        }
        this.CPF = CPF;
    }
    private boolean CPFValido(String CPF) {
        if (!Pattern.matches("\\d{11}", CPF)) {
            return false;
        }
        int[] numeros = new int[11];
        for (int i = 0; i < 11; i++) {
            numeros[i] = Character.getNumericValue(CPF.charAt(i));
        }
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += numeros[i] * (10 - i);
        }
        int resto = soma % 11;
        int digitoEsperado1 = (resto < 2) ? 0 : (11 - resto);
        if (numeros[9] != digitoEsperado1) {
            return false;
        }
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += numeros[i] * (11 - i);
        }
        resto = soma % 11;
        int digitoEsperado2 = (resto < 2) ? 0 : (11 - resto);
        return numeros[10] == digitoEsperado2;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getRG() {
        return RG;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public String getEndereco() {
        return endereco;
    }
}

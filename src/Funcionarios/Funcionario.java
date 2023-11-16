package Funcionarios;

import java.util.regex.Pattern;

public abstract class Funcionario {
    private String nome;
    private String CPF;
    private String RG;
    private EstadoCivil estadoCivil;
    private String endereco;


    public Funcionario(String nome, String CPF, String RG, EstadoCivil estadoCivil, String endereco) {
        this.nome = nome;
        this.RG = RG;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
        validarCPF(CPF);
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
}

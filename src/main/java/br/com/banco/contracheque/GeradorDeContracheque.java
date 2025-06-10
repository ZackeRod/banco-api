package br.com.banco.contracheque;

public class GeradorDeContracheque {
    private CalculadoraDeDescontos calculadora;

    public GeradorDeContracheque() {
        this.calculadora = new CalculadoraDeDescontos();
    }

    public Contracheque gerar(Funcionario funcionario) {
        double inss = calculadora.calcularINSS(funcionario.getSalarioBruto());
        double ir = calculadora.calcularIR(funcionario.getSalarioBruto());
        double cooperativa = calculadora.calcularDescontoCooperativa();
        double negocial = calculadora.calcularDescontoContribuicaoNegocial();

        return new Contracheque(funcionario, inss, ir, cooperativa, negocial);
    }
}


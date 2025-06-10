package br.com.banco.contracheque;

public class CalculadoraDeDescontos {

    private static final double DESCONTO_COOPERATIVA = 35.00;
    private static final double DESCONTO_CONTRIBUICAO_NEGOCIAL = 11.00;

    public double calcularINSS(double salarioBruto) {
        return salarioBruto * 0.11; // 11%
    }

    public double calcularIR(double salarioBruto) {
        if (salarioBruto <= 1903.98) {
            return 0;
        } else if (salarioBruto <= 2826.65) {
            return salarioBruto * 0.075;
        } else if (salarioBruto <= 3751.05) {
            return salarioBruto * 0.15;
        } else if (salarioBruto <= 4664.68) {
            return salarioBruto * 0.225;
        } else {
            return salarioBruto * 0.275;
        }
    }

    public double calcularDescontoCooperativa() {
        return DESCONTO_COOPERATIVA;
    }

    public double calcularDescontoContribuicaoNegocial() {
        return DESCONTO_CONTRIBUICAO_NEGOCIAL;
    }

    public double calcularTotalDescontos(double salarioBruto) {
        return calcularINSS(salarioBruto) +
                calcularIR(salarioBruto) +
                DESCONTO_COOPERATIVA +
                DESCONTO_CONTRIBUICAO_NEGOCIAL;
    }
}

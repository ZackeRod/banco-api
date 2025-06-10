package br.com.banco.contracheque;

public class Contracheque {
    private Funcionario funcionario;
    private double inss;
    private double ir;
    private double descontoCooperativa;
    private double descontoContribuicaoNegocial;
    private double totalDescontos;
    private double salarioLiquido;

    public Contracheque(Funcionario funcionario, double inss, double ir, double descontoCooperativa, double descontoContribuicaoNegocial) {
        this.funcionario = funcionario;
        this.inss = inss;
        this.ir = ir;
        this.descontoCooperativa = descontoCooperativa;
        this.descontoContribuicaoNegocial = descontoContribuicaoNegocial;
        this.totalDescontos = inss + ir + descontoCooperativa + descontoContribuicaoNegocial;
        this.salarioLiquido = funcionario.getSalarioBruto() - totalDescontos;
    }

    public void imprimir() {
        System.out.println("==== CONTRACHEQUE ====");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.printf("Salário Bruto: R$ %.2f%n", funcionario.getSalarioBruto());
        System.out.printf("Desconto INSS: R$ %.2f%n", inss);
        System.out.printf("Desconto IR: R$ %.2f%n", ir);
        System.out.printf("Desconto Cooperativa: R$ %.2f%n", descontoCooperativa);
        System.out.printf("Desconto Contribuição Negocial: R$ %.2f%n", descontoContribuicaoNegocial);
        System.out.printf("Total de Descontos: R$ %.2f%n", totalDescontos);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
    }
}


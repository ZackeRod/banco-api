package br.com.banco.contracheque;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Cargo do funcionário: ");
        String cargo = scanner.nextLine();

        System.out.print("Salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, cargo, salarioBruto);
        GeradorDeContracheque gerador = new GeradorDeContracheque();
        Contracheque contracheque = gerador.gerar(funcionario);

        System.out.println();
        contracheque.imprimir();

        scanner.close();
    }
}

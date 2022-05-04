package one.digitalinovation.basecamp;

import java.util.Scanner;

public class Calculadora {
    private double num1;
    private double num2;
    private String operacao;
    private boolean operacaoSair;

    public void calcular() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Digite a operacao matematica: + - * / caso queira sair digite: y");
            this.operacao = scan.next();
            this.operacaoSair = !operacao.equals("y");
            switch (this.operacao.hashCode()) {
                case '+':
                    System.out.println("Digite o primeiro numero: ");
                    this.num1 = scan.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    this.num2 = scan.nextDouble();
                    this.soma(this.num1, this.num2);
                    break;
                case '-':
                    System.out.println("Digite o primeiro numero: ");
                    this.num1 = scan.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    this.num2 = scan.nextDouble();
                    this.subtracao(this.num1, this.num2);
                    break;
                case '*':
                    System.out.println("Digite o primeiro numero: ");
                    this.num1 = scan.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    this.num2 = scan.nextDouble();
                    this.mutiplicacao(this.num1, this.num2);
                    break;
                case '/':
                    System.out.println("Digite o primeiro numero: ");
                    this.num1 = scan.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    this.num2 = scan.nextDouble();
                    this.divisao(this.num1, this.num2);
                    break;
            }
        } while(this.operacaoSair);
    };

    private double soma(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("A soma entre " +num1+ " + "+num2+ " = "+ result);
        return result;
    }

    private double subtracao(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("A subtracao entre " +num1+ " - "+num2+ " = "+ result);
        return result;
    }

    private double mutiplicacao(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("A mutiplicacao entre " +num1+ " * "+num2+ " = "+ result);
        return result;
    }

    private double divisao(double num1, double num2) {
        double result = num1 / num2;
        System.out.println("A divisao entre " +num1+ " / "+num2+ " = "+ result);
        return result;
    }
}

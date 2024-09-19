import java.util.Scanner;

public class AulaOperador {
  public static void main(String[] args) {
      
    Scanner scn = new Scanner (System.in);
    int primeiroValor = 0, segundoValor = 0, resultado = 0;
    double resultadoDiv;
    String op;

    System.out.println("Digite o primeiro numero: ");
    primeiroValor = scn.nextInt();
    System.out.println("Digite o segundo numero: ");
    segundoValor = scn.nextInt();
    System.out.println("Digite a operacao (+, -, *, /): ");
    op = scn.next();

    if(op.equals("/")) {
      resultadoDiv = (double)primeiroValor / segundoValor;
      System.out.println("O resultado da divisao é: " + resultadoDiv);
    }
    if(op.equals("+")) {
      resultado = primeiroValor + segundoValor;
      System.out.println("O resultado da soma é: " + resultado);
    } 
    if(op.equals("-")) {
      resultado = primeiroValor - segundoValor;
      System.out.println("o resultado da subtracao é: " + resultado);
    }
    if(op.equals("*")) {
      resultado = primeiroValor * segundoValor;
      System.out.println("O resultado da multiplicacao é: " + resultado);
    }
  }
}
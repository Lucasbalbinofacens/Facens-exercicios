import java.util.Scanner;

public class AulaAlgoritimo {

    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);

        // Criação das variáveis
        // Outra linha
         int primeiroValor = 5, segundoValor = 5, resultado = 10;

        System.out.println("Digite o primeiro numero da soma:");
        primeiroValor = scn.nextInt();
        System.out.println("Digite o segundo numero da soma");
        segundoValor = scn.nextInt();
        resultado = primeiroValor + segundoValor;
        System.out.println("A soma de " + primeiroValor + " e " + segundoValor + " é " + resultado);
    }
}
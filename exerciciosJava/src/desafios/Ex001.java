package desafios;

import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {
        // 0° Titulo do exercicio
        System.out.println("Exercicio de Soma de dois numeros");
        System.out.println();

        // 1° passo: Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // 2° passo: Solicita ao usuário que digite o primeiro número
        System.out.print("Digite o primeiro numero: ");
        // Lê o primeiro número digitado pelo usuário
        int numero1 = scanner.nextInt();

        // 3° passo: Solicita ao usuário que digite o segundo número
        System.out.print("Digite o segundo numero: ");
        // Lê o segundo número digitado pelo usuário
        int numero2 = scanner.nextInt();

        // Calcula a soma dos dois números
        int resultado = numero1 + numero2;

        // Exibe o resultado da subtração
        System.out.println("O resultado da soma dos dois valores é: "+ resultado);

        // Fecha o scanner
        scanner.close();

    }
}

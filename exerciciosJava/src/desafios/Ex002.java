package desafios;

import java.util.Scanner;

public class Ex002 {

    public static void main(String[] args) {
        // 0° Titulo do exercicio
        System.out.println("Exercicio de Subtração de dois numeros");
        System.out.println();

        // 1° passo: Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // 2° passo: Solicita ao usuário que digite o primeiro número
        System.out.print("Digite o primeiro numero: ");
        // Lê o primeiro numero digitado pelo usuario
        int numero1 = scanner.nextInt();


        // 3° passo: Solicita ao usuário que digite o segundo número
        System.out.print("Digite o segundo numero: ");
        // Lê o segundo numero digitado pelo usuario
        int numero2 = scanner.nextInt();

        // Calcula a soma dos dois números
        int resultado = numero1 - numero2;

        // Exibe o resultado da subtração
        System.out.println("O resultado da subtração dos dois valores é: "+ resultado);

        //fecha o scanner
        scanner.close();

    }
}

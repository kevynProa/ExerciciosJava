package desafios;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro Lado: ");
        int ladoA = scanner.nextInt();
        System.out.print("Digite o segundo Lado: ");
        int ladoB = scanner.nextInt();
        System.out.print("Digite o terceiro Lado: ");
        int ladoC = scanner.nextInt();
        if (ladoB + ladoC > ladoA) {
            System.out.println("Triângulo criado com Sucesso!");
        } else {
            System.out.println("Erro ao criar o Triângulo");
        }

        scanner.close();
    }
}

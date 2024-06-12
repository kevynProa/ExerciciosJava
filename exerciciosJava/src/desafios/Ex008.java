package desafios;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println(numero1 + " e maior que " + numero2);
        } else {
            System.out.println(numero2 + " e maior que " + numero1);
        }

        scanner.close();
    }
}

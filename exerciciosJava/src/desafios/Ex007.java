package desafios;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        if (numero >= 0) {
            System.out.println("O numero " + numero + " Positivo ");
        } else {
            System.out.println("O numero " + numero + " Negativo");
        }

        scanner.close();
    }
}

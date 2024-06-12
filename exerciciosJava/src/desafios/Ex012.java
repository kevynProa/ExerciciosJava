package desafios;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua Idade: ");
        int idade = scanner.nextInt();
        if (idade > 0 && idade <= 12) {
            System.out.println("você e uma criança sua idade é: " + idade);
        } else if (idade <= 17) {
            System.out.println("você e um(a) adolescente sua idade é: " + idade);
        } else if (idade <= 59) {
            System.out.println("você e um(a) adulto(a) sua idade é: " + idade);
        } else {
            System.out.println("você e um(a) idoso(a) sua idade é: " + idade);
        }

        scanner.close();
    }
}

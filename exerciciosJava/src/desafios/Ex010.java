package desafios;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();
        System.out.print("Digite a segunda nota: ");
        int nota2 = scanner.nextInt();
        System.out.print("Digite a terceira nota: ");
        int nota3 = scanner.nextInt();
        int media = (nota1 + nota2 + nota3) / 3;
        if (media < 5) {
            System.out.print("Aluno reprovado com media final igual á: " + media);
        } else if (media < 7) {
            System.out.print("Aluno em recuperação com media final igual á: " + media);
        } else {
            System.out.print("Aluno aprovado com media final igual á: " + media);
        }

        scanner.close();
    }
}

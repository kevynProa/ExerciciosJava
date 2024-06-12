package desafios;

import java.util.Scanner;

public class Ex005 {

    public static void main(String[] args) {

        // Titulo
        System.out.println("VALIDAÇÃO DE USUARIO");
        System.out.println();

        // 0°Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Login e Senha corretos
        String loginCorreto = "rodrigues.kevyn2016@gmail.com";
        String senhaCorreto = "14092003.k";

        // 1) informe o seu login
        System.out.print("login>");
        // Lê o valor digitado pelo usuario
        String login = scanner.nextLine();
        // 2) informe a sua senha
        System.out.print("senha>");
        // Lê o valor digitado pelo usuario
        String senha = scanner.nextLine();
        // 3) armazenar login e senha em variaveis
        if ( login.equals(loginCorreto) && senha.equals(senhaCorreto) ){
            System.out.println("Usuario logado com Sucesso!");
        }else{
            System.out.println("Usuario ou senha invalidos!");
        }
        // 4) verificar se o login e a senha estão corretos
        // Fecha o scanner
        scanner.close();
    }
}

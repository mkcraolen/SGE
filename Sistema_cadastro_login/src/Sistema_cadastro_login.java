package Sistema_cadastro_login;

import java.util.Scanner;

public class Sistema_cadastro_login {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean nomeP = false;
        boolean sobrenomeP = false;
        boolean senhaP = false;

        String nome = null;
        String sobrenome = null;
        String username = null;
        String senha = null;

        System.out.println("-Sistema de cadastro e login-");

        while(nomeP == false) {

            System.out.println("Digite seu nome:");

            nome = scanner.nextLine();

            //System.out.println(nome);

            if(nome.length()>3) {
                nomeP = true;
            } else {
                System.out.println("Tem de ter mais que 3 letras");
            }

        }

        while(sobrenomeP==false) {

            System.out.println("Digite seu sobrenome:");

            sobrenome = scanner.nextLine();

            //System.out.println(sobrenome);

            if (sobrenome.length() > 3) {
                sobrenomeP = true;
            } else {
                System.out.println("Tem de ter mais que 3 letras");
            }
        }

        while(senhaP==false) {

            System.out.println("Digite uma senha:");

            senha = scanner.nextLine();

            if(senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() > 7){

                //System.out.println("Senha forte!");
                senhaP=true;

            } else {

                System.out.println("Requer 1 letra maiuscula, 1 numero, e 1 desses caracteres # ! @, e ter mais que 7 caracteres!");

            }
        }

        if(nomeP==true && sobrenomeP==true && senhaP==true){

            System.out.println("Cadastrado com sucesso!");

            username = nome.charAt(0)+"_"+sobrenome;
            System.out.println("Username:"+username);

            System.out.println("Senha:"+senha);
        }

        // validando login e senha criados para realizar login

        boolean validar = false;

        while (validar == false){

            System.out.println("Insira seu username:");
            String vLogin = scanner.nextLine();

            System.out.println("Insira sua senha:");
            String vSenha = scanner.nextLine();

            if (vLogin.equals(username) && vSenha.equals(senha)){
                System.out.println("Login realizado com sucesso!");
                validar = true;
            }else{
                System.out.println("Login ou senha errados... tente novamente!");
            }
        }

    }
}

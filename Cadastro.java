// Guilherme Duarte de Barros, RA: 125221

import java.util.Scanner;

public class Cadastro {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("======Menu de opções======");
        System.out.println("Opção 1. Cadastrar produto.");
        System.out.println("Opção 2. Listar produto.");
        System.out.println("Sair do sistema.");
        System.out.println("======Escolha uma opção======");

        int menu = entrada.nextInt();

        switch (menu){
            case 1:
                System.out.println("Você escolheu a opção 1. Que é cadastrar produtos.");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2. Que é a opção Listar produtos.");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3. Que é sair do sistema.");
                break;
            default:
                System.out.println("Item de menu inválido.");

        }
        entrada.close();
    }
}

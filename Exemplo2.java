import java.util.Scanner;

public class Exemplo2 {

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        float idade, acumuladorIdades = 0; // acumulador
        int cont;
        float media;

        for(cont = 0; cont <12; cont++){
            System.out.println("Digite a sua idade.");
            idade = entrada.nextFloat();
            acumuladorIdades += idade; 
        }
            System.out.println("A soma das idades é: "+ acumuladorIdades);
            entrada.close();
            media = acumuladorIdades/cont;
            System.out.println(media);
    }
    
}

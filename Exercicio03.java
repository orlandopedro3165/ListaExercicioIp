package ListaExerciciosIp;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        ler.close();
        if( idade >= 16){
            System.out.println("Você pode votar.");
        }else{
            System.out.println("Voce nao pode votar.");
        }
    }
}

package ListaExerciciosIp;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        ler.close();
        if(idade <= 16 && idade < 18){
            System.out.println("Voce não pode votar e nem dirigir.");
        }else if(idade >= 16 && idade <= 18){
            System.out.println("Voce pode votar, mas nao pode dirigir.");
        }else{
            System.out.println("Voce pode votar e diriir.");
        }
    }

}

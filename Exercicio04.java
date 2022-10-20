package ListaExerciciosIp;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        ler.close();
        if(idade >= 18){
            System.out.println("Voce pode dirigir,");            
        }else{
            System.out.println("Você não pode dirigir.");            
        } 

    }
}

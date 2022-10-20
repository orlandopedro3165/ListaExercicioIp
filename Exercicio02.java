package ListaExerciciosIp;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println(" Digite numero um: ");
        int n1 = ler.nextInt();
        System.out.println("Digite numero dois: ");
        int n2 = ler.nextInt();
        System.out.println("Digite numero tres: ");
        int n3 = ler.nextInt();
        ler.close();
        if( n1 > n2 && n1 > n3){
            System.out.println(" Maior numero é o numero um.");
        }else if( n1 < n2 && n1 < n3){
            System.out.println(" O menor numero é o numero um. ");        }           
        if( n2 > n1 && n2 > n3){
            System.out.println(" O maior numero é o numero dois");
        }else if( n2< n1 && n2<n3){
            System.out.println(" O menor numero é o numero dois.");
        }else if( n3 > n1 && n3 > n2){
            System.out.println("o maior numero é o numero três.");
        }else if(n1 < n2 && n1 < n3){
            System.out.println("O menor numero é o numero um.");
        }else if( n2 < n1 && n2 <n3){
            System.out.println("O menor numero é o numerodois.");            
        }else{
            System.out.println(" o menor numero é o numero tres.");
        }
    }
}

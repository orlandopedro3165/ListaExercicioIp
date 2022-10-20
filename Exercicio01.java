package ListaExerciciosIp;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println(" digite um numero: ");
        int n = ler.nextInt();
        ler.close();
            if(n < 0){
            System.out.println("Numero menor que zero. " + n);
        } else if( n > 0){
            System.out.println("Numero maior que zero." + n);
        }else{
            System.out.println("Numero igual a zero. " + n);
        }
       
    }
}

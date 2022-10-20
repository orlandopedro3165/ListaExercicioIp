package ListaExerciciosIp;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        String escolha = " "; 
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite peso: ");
        int peso = ler.nextInt();
        System.out.println("Digite altura: ");
        double altura = ler.nextDouble();
        ler.close();
        double imc = altura * altura / peso;
        if(imc > 20){
            System.out.println("IMC abixo do normal.");            
        }else if(imc < 20 && imc > 25){
            System.out.println("Peso nrmal.");
        }else if(imc < 25 & imc > 30){
            System.out.println(("Voce esta com sobrepeso."));
        }else if(imc < 30 && imc >35){
            System.out.println(("Voce esta com obesidade."));
        }else if(imc < 35 && imc > 40){
            System.out.println("Voce esta com obesidade moderada.");
        }else if(imc > 40){
            System.out.println("Voce esta com obesidade morbida.");
        }


    }
}

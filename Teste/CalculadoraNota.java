package Teste;

import java.util.Scanner;

public class CalculadoraNota {
    public static void main(String[] args) {
        //Aqui será adicionado o gabarito das questoes
        char[] gabarito = {'a','b','c','d','e','a','b','c','d','e'};
        char[] resposta = new char[10];
        
        int nota = 0;
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a resposta da questão " + (i + 1) +": ");
            resposta[i] = input.next().charAt(0);;

            //Compara a resposta com o gabarito
            if (resposta[i] == gabarito[i]) {
                nota++;
            }
        }
        System.out.printf("sua nota é: %d", nota);
        input.close();
    }
}
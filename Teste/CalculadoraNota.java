package Teste;

import java.util.Scanner;

public class CalculadoraNota {
    public static void main(String[] args) {
        char[] gabarito = {'a','b','c','d','e','a','b','c','d','e'};
        char[] resposta = new char[10];
        
        int nota = 0;
        
        for (int i = 0; i < 10; i++) {
            resposta[i] = new Scanner(System.in).next().charAt(0);

            if (resposta[i] == gabarito[i]) {
                nota++;
            }
        }

        System.out.printf("sua nota é: %d", nota);
    }
}
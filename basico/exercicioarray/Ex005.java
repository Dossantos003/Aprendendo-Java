package flamingo.aprendendo.basico.exercicioarray;

import java.util.Scanner;

public class Ex005 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[6];

        for (int i = 0; i < numeros.length; i ++){
            System.out.printf("Digite o %d° número:", i + 1);
            numeros[i] = sc.nextInt();
                }
        int maior = numeros[0];
        for (int l = 1; l < numeros.length; l ++){
            if (numeros[l] > maior){
                maior = numeros[l];
            }


        }
        System.out.println("O maior número é" + maior);
    }
}

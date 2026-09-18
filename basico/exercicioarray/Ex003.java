package flamingo.aprendendo.basico.exercicioarray;

import java.util.Scanner;

public class Ex003 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[5];
        int soma = 0;
        for(int i = 0 ; i < numeros.length; i ++){
            System.out.println("Digite números :");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

            System.out.println("O total é " + soma);
        }
    }


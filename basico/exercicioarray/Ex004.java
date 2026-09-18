package flamingo.aprendendo.basico.exercicioarray;

import java.util.Scanner;

public class Ex004 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double media = notas[0];
        double soma = 0;
        for (int i = 0 ; i < notas.length; i ++ ){
            System.out.println("Digite as notas:");
            notas[i] = sc.nextInt();
            soma += notas[i];

        }
            media = soma / notas.length;
            System.out.println(media);
    }
}

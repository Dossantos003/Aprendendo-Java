package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturaDeRepetiçaoParte01 {
    static void main() {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        n = sc.nextInt();
        // for
        // while
        // do while

        // contador = contador + 1;
        // contador += 1;
        // contador ++
        //for(int contador = 0; contador <=10; contador++) {
        //System.out.println(contador);
        //}

        for (int numero = 0; numero <= 10; numero ++) {
            System.out.println( numero + " X " + n +" = " + numero * n );

        }
    }
}

package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturaDeRepeticaoParte02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero, n;
        System.out.println("Digite um numero:");
        n = sc.nextInt();
        numero = 1;
        // for
        // while
        // do while
       // int contador = 1;

        //while (contador<=10){
            //System.out.println(contador);

            //contador++;
        //}
        while (numero <=10){
            System.out.println(numero + " X " + n +" = " + numero * n);

            numero++;

        }

    }
}

package flamingo.aprendendo.basico.revisaoarray;

import java.util.Arrays;

public class ArraysRevisaoParte01 {
    static void main() {
        int[] numeros = new int[4];
        numeros[0] = 5;
        numeros[1] = 3;
        numeros[2] = 7;
        numeros[3] = 15;

        System.out.println(numeros[1]);
        System.out.println(Arrays.toString(numeros));
       // for (int numero : numeros){
            //System.out.println(numero);
        for(int i : numeros){
            System.out.println("indice" +i);
        }
        }

    }


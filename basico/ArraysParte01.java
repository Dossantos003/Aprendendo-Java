package flamingo.aprendendo.basico;

import java.util.Arrays;

public class ArraysParte01 {
    static void main() {
        System.out.println("Arrays");
        int[] idades = new int[5];
        idades[0] = 12;
        idades[1] = 21;
        idades[2] = 23;
        idades[3] = 51;
        idades[4] = 65;
        System.out.println(Arrays.toString(idades));

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + idades[i]);
        }
    }
}

package flamingo.aprendendo.basico;

public class ArraysExercicios {
    static void main(String[] args) {
        int[][] numero = new int[12][31];

        for (int i = 0; i < numero.length; i++) {
            for (int l = 0; l < numero[i].length; l++) {
                numero[i][l] = l + 1;
                System.out.println(numero[i][l]);
            }
        }



























    }
}


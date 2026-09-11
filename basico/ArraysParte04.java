package flamingo.aprendendo.basico;

public class ArraysParte04 {
    static void main(String[] args) {
        int[][] numeros = new int[3][3];
        numeros[0][0] = 4567;
        numeros[0][1] = 5685;
        numeros[0][2] = 37;

        numeros[1][0] = 22;
        numeros[1][1] = 33;
        numeros[1][2] = 88;

        numeros[2][0] = 45;
        numeros[2][1] = 56;
        numeros[2][2] = 37;


        for (int i = 0 ; i < numeros.length; i++){
            for (int l = 0; l < numeros[i].length; l++ ){
                System.out.println(numeros[i][l]);
            }



        }


    }
}

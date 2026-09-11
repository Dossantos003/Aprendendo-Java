package flamingo.aprendendo.basico.revisaoarray;

public class ArraysRevisaoParte04 {
    static void main() {
        int[] numeros = {21, 23, 55, 12, 42};

        for (int i = 0; i < numeros.length; i ++){
            System.out.println(numeros[i]);
        }
        System.out.println("-------------------------------------");

        for (int numero: numeros){
            System.out.println(numero);
        }
    }
}

package flamingo.aprendendo.basico;

public class OperadoresParte05 {
    static void main() {
        //Operadores de atribuição

        /*
        = atribuição simples
        += soma e atribuição
        -= subtração e atribuição
        *=  multiplicação e atribuição
        /= divisão e atribuição
        %= resto e atribuição
         */

        double totalCompra = 0;

        totalCompra += 50;
        totalCompra += 100;
        totalCompra += 50;
        totalCompra /= 2;

        System.out.printf("O total da compra é = %.2f", totalCompra);





        int numero = 1000;

        numero = numero + 100;
        System.out.println("Operadores Parte 5");
        System.out.println(numero);
    }
}

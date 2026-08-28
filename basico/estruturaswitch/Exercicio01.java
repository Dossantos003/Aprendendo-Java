package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Exercicio01 {
    static void main() {
        int tipoCombustivel;
        double litros ;
        String resultado;
        String resultadoLitros;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de Combustivel:");
        System.out.println("Digite o quanto litros irá colocar:");
        tipoCombustivel = sc.nextInt();
        litros = sc.nextByte();

        switch (tipoCombustivel){
            case 1 :
                resultado = "Gasolina";
                break;
                case 2 :
                    resultado = "Etanol";
                    break;
            case 3 :
                resultado = "Diesel";
            default:
                resultado = "numero invalido";
        }
        if (tipoCombustivel == 1){
            System.out.println("O tipo de combustivel é Gasolina" + " o valor do combustivel é " + litros * 5.89);
        } else if (tipoCombustivel == 2){
            System.out.println("O tipo de combustivel é Etanol" + "o valor do combustivel é " + litros * 3.99);
        } else if (tipoCombustivel == 3){
            System.out.println("O tipo de combustivel é Diesel" + "o valor do combustivel é " + litros * 6.19);
        }else {
            System.out.println(" ");
        }

sc.close();
    }
}

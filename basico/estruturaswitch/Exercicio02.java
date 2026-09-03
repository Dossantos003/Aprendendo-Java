package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Exercicio02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        byte opcaoLanche, quantidade;
        String resultado;
        System.out.println("Digite um valor de 1 á 4 \n" +
                "1 → Hambúrguer — R$ 25,00 \n " +
                "2 → Pizza — R$ 40,00 \n " +
                "3 → Batata frita — R$ 18,00 \n " +
                "4 → Refrigerante — R$ 8,00 5 → \n " +
                "Suco — R$ 10,00");
        opcaoLanche = sc.nextByte();
        quantidade = sc.nextByte();
        switch (opcaoLanche) {
            case 1:
                System.out.println("Você escolheu o hamburguer");
                System.out.println("A quantidade escolhida foi: " + quantidade);
                resultado = "O valor total deu " + quantidade * 25;
                break;
            case 2:
                System.out.println("Você escolheu a pizza");
                System.out.println("A quantidade escolhida foi: " + quantidade);
                resultado = "O valor total deu " + quantidade * 40;
                break;
            case 3:
                System.out.println("Voc");
        }
    }
}





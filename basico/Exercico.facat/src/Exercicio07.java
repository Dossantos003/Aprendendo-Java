package flamingo.aprendendo.basico.Exercico.facat.src;

import java.util.Scanner;

public class Exercicio07 {
    static void main() {
        double idade, ano, meses, diasDeVida, dias ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade para descobrir quantos dias você ja viveu: ");
        idade = sc.nextByte();
        System.out.println("Digite o meses adicionais");
        meses = sc.nextDouble();
        System.out.println("Digite os dias adicionais ");
        dias = sc.nextByte();
        diasDeVida = (idade * 365) + (meses * 30) + dias ;
        System.out.printf("Sua idade em dias é %.0f" , diasDeVida);





     sc.close();
    }
}

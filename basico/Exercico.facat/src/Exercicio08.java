package flamingo.aprendendo.basico.Exercico.facat.src;

import java.util.Scanner;

public class Exercicio08 {
    static void main() {
        double eleitores, brancos, nulos, validos, porcentualbrancos, porcentualeleitores, porcentualnulo, porcentualvalido;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o total de eleitores Municipal:");
        eleitores = sc.nextDouble();
        System.out.println("Digite o total de votos brancos:");
        brancos = sc.nextDouble();
        System.out.println("Digite o total de votos validos: ");
        validos = sc.nextDouble();
        System.out.println("Digite o total de votos nulos:");
        nulos = sc.nextDouble();

        porcentualbrancos = (eleitores * 100) / brancos;
        porcentualnulo = (eleitores * 100) / nulos ;
        porcentualvalido = (eleitores * 100) / validos;


        System.out.printf("Os números de eleitores é %.0f " +
                "os números de votos brancos é %.0f " +
                "os votos nulos é %.0f os números de validos é %.0f"
                , eleitores, brancos, nulos, validos);
        System.out.printf(" Porcentual %f%% /n" +
                " Votos Brancos = %f%% /n" +
                " Votos Nulos = %f%% " +
                "/n Votos Validos = %f%% " ,eleitores,brancos, nulos, validos);


        sc.close();
    }
}

package flamingo.aprendendo.basico.Exercico.facat.src;

import java.util.Scanner;

public class Exercicio06 {
    static void main() {
        double area, base, altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base do retângulo");
        base = sc.nextDouble();

        System.out.println("Digite a altura do retângulo");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.printf("A área do retângulo é %.2f", area);

    }

}

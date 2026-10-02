package flamingo.aprendendo.basico.intermediario.teste;

import flamingo.aprendendo.basico.intermediario.dominio.Carro;
import flamingo.aprendendo.basico.intermediario.dominio.ImpressoraCarro;

import java.util.Scanner;

public class CarroTeste02 {
    static void main() {
        ImpressoraCarro impressora = new ImpressoraCarro();

        Scanner sc = new Scanner(System.in);
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        System.out.println("Digite o nome do carro : ");
        carro01.nome = sc.nextLine();

        System.out.println("Digite a marca do Carro : ");
        carro01.marca = sc.nextLine();

        System.out.println("Digite o ano do Carro : ");
        carro01.ano = sc.nextInt();

        System.out.println("Digite a velocidade do Carro");
        carro01.velocidadeAtual = sc.nextInt();

        carro02.nome = "Civic";
        carro02.marca = "Honda";
        carro02.ano = 1999;
        carro02.velocidadeAtual = 75;

        impressora.imprime(carro01);
        impressora.imprime(carro02);

        sc.close();
    }
}

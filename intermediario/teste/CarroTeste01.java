package flamingo.aprendendo.basico.intermediario.teste;

import flamingo.aprendendo.basico.intermediario.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();

        carro01.velocidadeAtual = 200;
        carro01.nome = "Celta";
        carro01.marca = "chevrolet";
        carro01.ano = 2010;




        System.out.println("O Limite da via é : \n" + carro01.verificarOCarro(220));
        System.out.println();
    }
}
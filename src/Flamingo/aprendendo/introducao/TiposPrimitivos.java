package Flamingo.aprendendo.introducao;

import java.security.KeyStore;

public class TiposPrimitivos {

    public static void main (String[] args){
        //byte = -128 até 127
        //short = -32.768 até 32.767
        //int = -2bilhões até 2 bilhões
        //long = Para números inteiros muito grandes (usa um L no final do número)
        //float = Para números decimas
        // char = Guarda uma única letra ou símbolo em formato Unicode
        short idade = 22;
        int municipio = 20000000;
        long contaBancaria = 999999999999999999L;
        float salario = 100.50f;
        double salarioExtra = 25000.50;
        char primeiraLetraDoNome = 'R';
        boolean vaiEstudarnasFerias = true;
        System.out.println("Primeira letra do meu nome é " + primeiraLetraDoNome);
        System.out.println("PLR Caiu " + salarioExtra);
        System.out.println("Minha idade é " + idade);
        System.out.println("A população do municipio é " + municipio + " milhões de moradores");
        System.out.println("A minha conta bancaria daqui a 5 anos " + contaBancaria);
        System.out.println("O meu salário é " + salario);
        System.out.println(vaiEstudarnasFerias);
    }

}

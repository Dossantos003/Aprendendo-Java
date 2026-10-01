package flamingo.aprendendo.basico.intermediario.teste;

import flamingo.aprendendo.basico.intermediario.dominio.SomaDoisNumeros;

public class SomaDoisNumerosTeste01 {
    static void main() {
        SomaDoisNumeros somaDoisNumeros = new SomaDoisNumeros();

        int multiplica = somaDoisNumeros.somaDoisNumeros02(2,2) * 4;


        System.out.println(multiplica);
    }
}

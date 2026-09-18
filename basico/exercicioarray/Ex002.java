package flamingo.aprendendo.basico.exercicioarray;

import java.util.Scanner;

public class Ex002 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int idades[] = new int[6];
        for(int i = 0 ; i < idades.length; i ++){
            System.out.println("Digite um número");
            idades[i] = sc.nextInt();
        }
        for ( int idade: idades){
            System.out.println(idade);
        }
    }
}

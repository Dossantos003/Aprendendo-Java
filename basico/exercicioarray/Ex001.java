package flamingo.aprendendo.basico.exercicioarray;

import java.util.Scanner;

public class Ex001 {
    // Crie um programa que peça o nome de 5 alunos e depois
    // mostre todos os nomes

    static void main() {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[5];
        for (int i = 0; i < nome.length; i++){
            System.out.println("Digite o nome do aluno:");
            nome[i] = sc.nextLine();

        }

        for(String nomes : nome){
            System.out.println(nomes);
        }


    }
}


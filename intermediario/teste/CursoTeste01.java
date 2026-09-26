package flamingo.aprendendo.basico.intermediario.teste;

import flamingo.aprendendo.basico.intermediario.dominio.Disciplina;

import java.util.Scanner;

public class CursoTeste01 {
    static void main() {
        Curso curso = new Curso();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do professor: ");
        String nome = sc.nextLine();
        disciplina.nomeDoProfessor = nome;

        System.out.println("Digite a carga horaria: ");
        Double cargaHoraria = sc.nextDouble();
        disciplina.cargaHoraria = cargaHoraria;

        System.out.println("Digite o nome da disciplina: ");
        String name = sc.nextLine();
        disciplina.nome = name;

        System.out.println("Digite o Semestre: ");
        int semestre = sc.nextInt();
        disciplina.semestre = semestre;

        System.out.println(disciplina.nomeDoProfessor);
        System.out.println(disciplina.cargaHoraria);
        System.out.println(disciplina.nome);
        System.out.println(disciplina.semestre);
    }
}

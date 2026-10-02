package flamingo.aprendendo.basico.intermediario.teste;

import flamingo.aprendendo.basico.intermediario.dominio.Professor;

import java.util.Scanner;
// nome, disciplina, salario,idade

public class ProfessorTeste02 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor();
        System.out.println("Digite o nome do professor:");
        String nome = sc.nextLine();
        professor.nome = nome;

        System.out.println("Digite sua idade:");
        int idade = Integer.parseInt(sc.nextLine());
        professor.Idade = idade ;

        System.out.println("Digite a disciplina: ");
        String disciplina = sc.nextLine();
        professor.disciplina = disciplina;

        System.out.println("Digite o valor do sálario: ");
        Double salario = sc.nextDouble();
        professor.salario = salario;

        System.out.println(professor.nome);
        System.out.println(professor.Idade);
        System.out.println(professor.disciplina);
        System.out.println(professor.salario);

    }

}

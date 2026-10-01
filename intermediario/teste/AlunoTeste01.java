package flamingo.aprendendo.basico.intermediario.teste;

import flamingo.aprendendo.basico.intermediario.dominio.Aluno;

public class AlunoTeste01 {
    static void main() {
        Aluno aluno01 = new Aluno();

        aluno01.nome = "Bigode";
        aluno01.nota = 8.5;

        System.out.println("Aluno: " + aluno01.nome);
        System.out.println("Nota: " + aluno01.nota);
        System.out.println("Aprovado" + aluno01.isAprovado());
        System.out.println(aluno01.verificarConvite());
    }
}

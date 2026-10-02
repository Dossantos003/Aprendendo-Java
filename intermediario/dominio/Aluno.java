package flamingo.aprendendo.basico.intermediario.dominio;

public class Aluno {
    public String nome;
    public double nota;

    public boolean isAprovado() {
        return nota >= 7;
    }

    public String verificarConvite() {
        if (isAprovado()) {
            return nome + "foi aprovado e recebeu convite para a festa.";

        }
            return nome + "Você não foi aprovado e não recebeu convite";

    }

}

package flamingo.aprendendo.basico.intermediario.dominio;

public class Carro {

    public String nome;
    public String marca;
    public int ano;
    public double velocidadeAtual;


    public boolean isAprovado(int via) {
        return velocidadeAtual >= via;

    }

    public String verificarOCarro(int via ){

        if (isAprovado(via)) {
            return "O nome do carro : " + nome + "\nO  nome da marca :" + marca + "\nO ano do carro: " + ano + "\n você está na velocidade certa: " + velocidadeAtual + "\nVocê não foi multado" ;

        } else {
            return "O nome do carro : " + nome + "\nO  nome da marca :" + marca + "\nO ano do carro: " + ano + "\nVocê passou do limite de velocidade: " + velocidadeAtual + "\nVocê foi multado";

        }
    }

    //
}

package flamingo.aprendendo.basico;

public class ArraysParte02 {
    static void main() {
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "luffy";
        nomes[2] = "naruto";
        nomes[3] = "Ichigo";

        int i = 0;
        while (i < nomes.length){
            System.out.println(nomes[i]);
            i++;
        }

        nomes = new String[5];
        nomes[4] = "zoro";
        System.out.println(nomes[4]);
    }
}

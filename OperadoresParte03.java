package flamingo.aprendendo.basico;

/*
&& And -> E
II or -. OU
! not -> NÂO
 */
public class OperadoresParte03 {
    static void main() {
        byte idade = 22;
        boolean isCNH = true;

        boolean isEstaNaleiParaDirigir = idade >= 18 && isCNH;

        System.out.println("Operadores Parte 03");
        System.out.println(isEstaNaleiParaDirigir);
    }
}

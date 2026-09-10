package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturasCondicionaisParte04 {
    static void main() {
        System.out.println("Estruturas Condicionais");
        Scanner sc = new Scanner (System.in);

        //Switch Case (Ecolha caso)

        System.out.println("Coloque o dia da semana de 1 á 7 :");
        byte diaSemana = sc.nextByte();
        String resultado;
        switch(diaSemana){
            case 1:
                resultado = "Domingo";
                break;
            case 2:
                resultado = "Segunda-feira";
                break;
            case 3:
                resultado = "Terça-feira";
                break;
            case 4:
                resultado = "Quarta-feira";
                break;
            case 5:
                resultado = "Quinta-feira";
                break;
            case 6:
                resultado = "Sexta-feira";
                break;
            case 7:
                resultado = "Sábado";
                break;
            default:
                resultado = "Dia inválido";
                break;}
        System.out.println(resultado);
        sc.close();
    }

}

package flamingo.aprendendo.basico;

import org.w3c.dom.ls.LSOutput;

public class ArraysParte05 {
    static void main() {
        int[][] diasDosMeses = new int[12][];
        diasDosMeses[0] = new int[31];
        diasDosMeses[1] = new int[28];
        diasDosMeses[2] = new int[31];
        diasDosMeses[3] = new int[30];
        diasDosMeses[4] = new int[31];
        diasDosMeses[5] = new int[30];
        diasDosMeses[6] = new int[31];
        diasDosMeses[7] = new int[31];
        diasDosMeses[8] = new int[30];
        diasDosMeses[9] = new int[31];
        diasDosMeses[10] = new int[30];
        diasDosMeses[11] = new int[31];

        for (int i = 0; i < diasDosMeses.length; i++) {
            System.out.println("------------------");
            for (int l = 0; l < diasDosMeses[i].length; l++) {
                diasDosMeses[i][l] = l + 1;
                System.out.println( "Dias " + diasDosMeses[i][l]);
            }
        }
    }
}

                //for (int[] diaDoMes : diasDosMeses) {
                    //for (int dia : diaDoMes) {
                       // System.out.println("Dia " + dia);
                   // }
                    //System.out.println("--------------------");
                //}
           // }


        //}




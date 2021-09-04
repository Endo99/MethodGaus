package sistematriangular;

public class SistemaTriangular {

    int pivo;
    int multiplicador2;
    int multiplicador3;
    int multiplicador32;
    int[][] matriz;
    int[] colunaResultado;

    public void calculaMatriz() {
        //Calcula os elementos da linha 2 e 3 da primeira coluna
        for (int j = 0; j < matriz.length; j++) {
            matriz[1][j] = matriz[1][j] - ((multiplicador2) * matriz[0][j]);
        }
        for (int i = 0; i < matriz.length; i++) {
            matriz[2][i] = matriz[2][i] - ((multiplicador3) * matriz[0][i]);
        }
        colunaResultado[1] = colunaResultado[1] - ((multiplicador2) * colunaResultado[0]);
        colunaResultado[2] = colunaResultado[2] - ((multiplicador3) * colunaResultado[0]);

        //Calcula o elemento da linha 3 coluna 2
        pivo = matriz[1][1];
        multiplicador32 = matriz[2][1] / pivo;

                System.out.println(pivo);
        System.out.println(multiplicador32);
        System.out.println(matriz[2][1]);
        System.out.println(matriz[0][1]);
        
        matriz[2][1] = matriz[2][1] - (pivo * multiplicador32);
        

    }
}
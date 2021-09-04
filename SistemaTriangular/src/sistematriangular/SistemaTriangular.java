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

    public int[] getColunaResultado() {
        return colunaResultado;
    }

    public void setColunaResultado(int[] colunaResultado) {
        this.colunaResultado = colunaResultado;
    }

    public int getPivo() {
        return pivo;
    }

    public void setPivo(int pivo) {
        this.pivo = pivo;
    }

    public void calculaMultiplicador() {
        multiplicador2 = matriz[1][0] / pivo;
        multiplicador3 = matriz[2][0] / pivo;
    }

    public boolean obterPivo() {
        if (matriz[0][0] != 0) {
            pivo = matriz[0][0];
        } else if (matriz[1][0] != 0) {
            pivo = matriz[1][0];
        } else if (matriz[2][0] != 0) {
            pivo = matriz[2][0];
        } else {
            return false;
        }
        return true;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

}
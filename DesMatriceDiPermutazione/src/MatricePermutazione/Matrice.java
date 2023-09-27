package MatricePermutazione;
import java.util.Random;

public class Matrice {
    private final int[][] matrice;

    public Matrice(){
        //cosi la matrice ha tutti le celle che valgono 0
        matrice = new int[8][8];
    }

    public void Stampa() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matrice[i][j] + "\t\t");
            }
            System.out.println(); // Move to the next row
        }
    }

    private boolean valoreGiaPresente(int n) {
        boolean valoreGiaTrovato = false;
        outerLoop:
        for (int k = 0; k < 8; k++) {
            for (int j = 0; j < 8; j++) {
                if(matrice[k][j] == n) {
                    valoreGiaTrovato = true;
                    break outerLoop;
                }
            }
        }
        return valoreGiaTrovato;
    }

    public void Carica() {
        int i = 0;
        Random rand = new Random();
        boolean valoreGiaTrovato;
        while(i < 64) {
            int n = rand.nextInt(1,65);

            valoreGiaTrovato = valoreGiaPresente(n);

            if(!valoreGiaTrovato) {
                outerLoop:
                for (int k = 0; k < 8; k++) {
                    for (int j = 0; j < 8; j++) {
                        if(matrice[k][j] == 0) {
                            matrice[k][j] = n;
                            i++;
                            break outerLoop;
                        }
                    }
                }
            }
        }
        System.out.println("ciao");
    }

}

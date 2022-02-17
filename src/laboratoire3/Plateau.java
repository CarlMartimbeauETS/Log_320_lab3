package laboratoire3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Plateau {
    public char[][] grilleCases;
    int taille;


    public Plateau(String file){
        try {
            initComponents(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initComponents(String file) throws IOException {
        FileInputStream fileIn = new FileInputStream(file);
        char tailleNchar = ((char)fileIn.read());
        int n = Character.getNumericValue(tailleNchar);
        taille = n;
        grilleCases = new char[taille][taille];

        //System.out.println(n);

        int singleCharInt;
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                singleCharInt = fileIn.read();
                if (singleCharInt== '\n'){
                    j-=2;
                }else{
                    grilleCases[i][j] = (char)singleCharInt;
                }
            }
        }
        //System.out.println("fini");
        //imprimerGille();

    }

    private void imprimerGille(){
        for (int i= 0; i<taille; i++){
            for(int j=0; j<taille; j++){
                System.out.print(grilleCases[i][j]);
            }
            System.out.println();
        }
    }


    public int getTaille() {
        return taille;
    }

    public char obtenirCase(int i, int j){
        return grilleCases[i][j];
    }


}

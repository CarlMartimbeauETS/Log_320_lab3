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

        System.out.println(n);

        int singleCharInt;
        int ligne = 0;
        int colonne = 0;
        fileIn.read();
        while ((singleCharInt = fileIn.read()) != -1 && ligne <= taille-1) {
            if ((char) singleCharInt== '\n'){
                ligne ++;
                colonne = 0;

            }
            else{
                grilleCases[ligne][colonne] = (char)singleCharInt;
                colonne++;
            }




        }
        //System.out.println("fini");
        imprimerGille();

    }

    private void imprimerGille(){
        for (int i= 0; i<taille; i++){
            for(int j=0; j<taille; j++){
                System.out.print(grilleCases[i][j]);
            }
            System.out.println();
        }
    }


}

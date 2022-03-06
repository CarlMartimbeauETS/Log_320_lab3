package laboratoire3;

import java.io.DataInputStream;
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

        char c = (char) fileIn.read();
        String tailleString = "";

        while(c != -1 && c != 10 && c != 13){ //10 = line feed, 13 = carriage return
            tailleString += c;
            c = (char) fileIn.read();
        }

        int n = Integer.parseInt(tailleString);
        taille = n;
        grilleCases = new char[taille][taille];

        int singleCharInt;
        int i = 0;
        int j = 0;
        while(c != -1){
            c = (char)fileIn.read();

            if((i > (n-1))){
                break;
            }
            else if(c == 10){
                continue;
            }
            else if(c != 13){
                grilleCases[i][j] = c;
                j++;
            }
            else{
                i++;
                j = 0;
            }
        }

        //System.out.println("fini");
        //imprimerGrille();
        fileIn.close();

    }

    private void imprimerGrille(){
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

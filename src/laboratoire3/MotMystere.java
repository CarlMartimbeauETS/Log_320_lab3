package laboratoire3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedSet;

public class MotMystere {
    Plateau plateau;

    public String[] Resoudre(String nomFichierGrille, String nomFichierDict)
    {
        Plateau plateau = new Plateau(nomFichierGrille);
        Dictionnaire dictionnaire = new Dictionnaire(nomFichierDict);
        ArrayList<String> cles = new ArrayList<>();
        for (int i = 0; i < plateau.getTaille()-2 ; i++) {
            for (int j = 0; j < plateau.getTaille()-2; j++) {
                cles.add(""+plateau.grilleCases[i][j]+plateau.grilleCases[i][j+1]+ plateau.grilleCases[i][j+2]);
                cles.add(""+plateau.grilleCases[i][j+2]+plateau.grilleCases[i][j+1]+ plateau.grilleCases[i][j]);
            }
        }
        for (int i = 0; i < cles.size() ; i++) {
            System.out.println(cles.get(i));
        }

        return null;
    }


}

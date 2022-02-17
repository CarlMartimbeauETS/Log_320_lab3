package laboratoire3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedSet;

public class MotMystere {

    public String[] Resoudre(String nomFichierGrille, String nomFichierDict)
    {
        Plateau plateau = new Plateau(nomFichierGrille);
        Dictionnaire dictionnaire = new Dictionnaire(nomFichierDict);
        ArrayList<String> cles = new ArrayList<>();
        for (int i = 0; i < plateau.getTaille(); i++) {
            for (int j = 0; j < plateau.getTaille(); j++) {
                if (i>1){
                    System.out.println( "East -> West");
                }
                if (i < plateau.getTaille()-2){
                    System.out.println( "West - East");
                }
                if (j>1){
                    System.out.println("South -> North");
                }
                if (j < plateau.getTaille()-2){
                    System.out.println("North -> South");
                }
                if (i>1 && j>1){
                    System.out.println("South East -> North West");
                }
                if (i>1 && j < plateau.getTaille()-2){
                    System.out.println("North West -> South East");
                }
                if (j>1 && i < plateau.getTaille()-2){
                    System.out.println("South East -> North West");
                }
                if (j < plateau.getTaille()-2 && i < plateau.getTaille()-2){
                    System.out.println("North West -> South East");
                }

            }
        }
        return null;
    }


}

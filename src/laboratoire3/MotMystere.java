package laboratoire3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.SortedSet;

public class MotMystere {
    Plateau plateau;
    Dictionnaire dictionnaire;
    ArrayList<String> motsTrouves = new ArrayList<>();
    public void initComponents(String nomFichierGrille, String nomFichierDict){
        this.plateau = new Plateau(nomFichierGrille);
        this.dictionnaire = new Dictionnaire(nomFichierDict);
    }

    public String[] Resoudre(String nomFichierGrille, String nomFichierDict)
    {

        initComponents(nomFichierGrille, nomFichierDict);
        ArrayList<String> cles = new ArrayList<>();
        for (int i = 0; i < plateau.getTaille(); i++) {
            for (int j = 0; j < plateau.getTaille(); j++) {
                if (j>1){
                  //  System.out.println( "East -> West");

                }
                if (j < plateau.getTaille()-2){
                  //  System.out.println( "West - East");

                    rechercheEst("" + plateau.obtenirCase(i,j) + plateau.obtenirCase(i,j+1) + plateau.obtenirCase(i,j+2)  ,i,j);
                }
                if (i>1){
                   // System.out.println("South -> North");
                    //rechercheNord()
                }
                if (i < plateau.getTaille()-2){
                  //  System.out.println("North -> South")//
                    //rechercheSud()
                }
                if (i>1 && j>1){
                   // System.out.println("South East -> North West");
                }
                if (j>1 && i < plateau.getTaille()-2){
                  //  System.out.println("North West -> South East");
                }
                if (i>1 && j < plateau.getTaille()-2){
                 //   System.out.println("South East -> North West");
                }
                if (i < plateau.getTaille()-2 && j < plateau.getTaille()-2){
                   // System.out.println("North West -> South East");
                }

            }
        }

        String[] listeMotsFormate = new String[this.motsTrouves.size()];
        for(int i=0; i<motsTrouves.size(); i++) {
            listeMotsFormate[i] = motsTrouves.get(i);
        }
        return listeMotsFormate;

    }




    public void rechercheEst(String clef, int positionDepartI, int positionDepartJ){
        //On fait une requete au Dictionnaire pour savoir des mots commencent par ces 3 premieres lettres
        ArrayList<String> motsPossibles = dictionnaire.getListeMotsPossibles(clef);

        //Si des mots sont retournes on entame la recherche
        if(motsPossibles != null){
            for(String mot: motsPossibles){
                //verifer si assez de place pour faire la recherche
                if(mot.length() < plateau.taille-positionDepartJ){
                    //on boucle tant que le mot construit par la grille correspond au mot
                    String motContruit = clef;
                    int positionCurseur = positionDepartJ + 2;
                    while(mot.startsWith(motContruit)){
                        if (motContruit.equals(mot)){
                            motsTrouves.add(mot);
                        }
                        positionCurseur ++;
                        motContruit += plateau.obtenirCase(positionDepartI,positionCurseur);
                    }
                }
            }

        }
    }

    public void rechercheOuest(String clef, int positionDepartI, int positionDepartJ) {


    }
    public void rechercheNord(String clef, int positionDepartI, int positionDepartJ) {


    }

    public void rechercheSud(String clef, int positionDepartI, int positionDepartJ) {


    }
    public void rechercheNordEst(String clef, int positionDepartI, int positionDepartJ) {


    }

    public void rechercheNordOuest(String clef, int positionDepartI, int positionDepartJ) {


    }

    public void rechercheSudOuest(String clef, int positionDepartI, int positionDepartJ) {


    }

    public void rechercheSudEst(String clef, int positionDepartI, int positionDepartJ) {


    }


}

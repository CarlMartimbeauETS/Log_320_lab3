package laboratoire3;

import java.util.*;
import java.util.stream.Collectors;

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
                    rechercheOuest("" + plateau.obtenirCase(i,j) + plateau.obtenirCase(i,j-1) + plateau.obtenirCase(i,j-2)  ,i,j);
                }
                if (j < plateau.getTaille()-2){
                  //  System.out.println( "West - East");
                    rechercheEst("" + plateau.obtenirCase(i,j) + plateau.obtenirCase(i,j+1) + plateau.obtenirCase(i,j+2)  ,i,j);
                }
                if (i>1){
                   // System.out.println("South -> North");
                    rechercheNord("" + plateau.obtenirCase(i,j) + plateau.obtenirCase(i-1,j) + plateau.obtenirCase(i-2,j), i,j);
                }
                if (i < plateau.getTaille()-2){
                  //  System.out.println("North -> South")
                    rechercheSud("" + plateau.obtenirCase(i,j) + plateau.obtenirCase(i+1,j) + plateau.obtenirCase(i+2,j)  ,i,j);
                }
                if (i>1 && j>1){
                   // System.out.println("South East -> North West");
                    rechercheNordOuest("" + plateau.obtenirCase(i,j) + plateau.obtenirCase(i-1,j-1) + plateau.obtenirCase(i-2,j-2), i,j);
                }
                if (j>1 && i < plateau.getTaille()-2){
                    // System.out.println("North East -> South West");
                    rechercheSudOuest("" + plateau.obtenirCase(i,j) + plateau.obtenirCase(i+1,j-1) + plateau.obtenirCase(i+2,j-2), i,j);
                }
                if (i>1 && j < plateau.getTaille()-2){
                    // System.out.println("South West -> North East");
                    rechercheNordEst("" + plateau.obtenirCase(i,j) + plateau.obtenirCase(i-1,j+1) + plateau.obtenirCase(i-2,j+2), i,j);
                }
                if (i < plateau.getTaille()-2 && j < plateau.getTaille()-2){
                   // System.out.println("North West -> South East");
                    rechercheSudEst("" + plateau.obtenirCase(i,j) + plateau.obtenirCase(i+1,j+1) + plateau.obtenirCase(i+2,j+2)  ,i,j);
                }

            }
        }

        Collections.sort(this.motsTrouves);
        String[] listeMotsFormate = this.motsTrouves.stream().distinct().toArray(String[]::new);
        return listeMotsFormate;

    }




    public void rechercheEst(String clef, int positionDepartI, int positionDepartJ){
        //On fait une requete au Dictionnaire pour savoir des mots commencent par ces 3 premieres lettres
        ArrayList<String> motsPossibles = dictionnaire.getListeMotsPossibles(clef);
        //Si des mots sont retournes on entame la recherche
        if(motsPossibles != null){
            for(String mot: motsPossibles){
                //verifer si assez de place pour faire la recherche
                if(mot.length()+positionDepartJ <= plateau.getTaille()){
                    //on boucle tant que le mot construit par la grille correspond au mot
                    String motContruit = clef;
                    int positionCurseur = positionDepartJ + 2;
                    boolean trouve =false;
                    while(mot.startsWith(motContruit) && !trouve){
                        if (motContruit.equals(mot)){
                            motsTrouves.add(mot);
                            trouve=true;
                        } else {
                            positionCurseur ++;
                            motContruit += plateau.obtenirCase(positionDepartI,positionCurseur);
                        }
                    }
                }
            }

        }
    }

    public void rechercheOuest(String clef, int positionDepartI, int positionDepartJ) {
        //On fait une requete au Dictionnaire pour savoir des mots commencent par ces 3 premieres lettres
        ArrayList<String> motsPossibles = dictionnaire.getListeMotsPossibles(clef);

        //Si des mots sont retournes on entame la recherche
        if(motsPossibles != null){
            for(String mot: motsPossibles){
                //verifer si assez de place pour faire la recherche
                if(positionDepartJ-mot.length() >= -1 ){
                    //on boucle tant que le mot construit par la grille correspond au mot
                    String motContruit = clef;
                    int positionCurseur = positionDepartJ-2;
                    boolean trouve =false;
                    while(mot.startsWith(motContruit) && !trouve){
                        if (motContruit.equals(mot)){
                            motsTrouves.add(mot);
                            trouve=true;
                        }
                        else {
                            positionCurseur--;
                            motContruit += plateau.obtenirCase(positionDepartI, positionCurseur);
                        }
                    }
                }
            }

        }

    }
    public void rechercheNord(String clef, int positionDepartI, int positionDepartJ) {
        //On fait une requete au Dictionnaire pour savoir des mots commencent par ces 3 premieres lettres
        ArrayList<String> motsPossibles = dictionnaire.getListeMotsPossibles(clef);

        //Si des mots sont retournes on entame la recherche
        if(motsPossibles != null){
            for(String mot: motsPossibles){
                //verifer si assez de place pour faire la recherche
                if(positionDepartI-mot.length() >= -1 ){
                    //on boucle tant que le mot construit par la grille correspond au mot
                    String motContruit = clef;
                    int positionCurseur = positionDepartI-2;
                    boolean trouve =false;
                    while(mot.startsWith(motContruit) && !trouve){
                        if (motContruit.equals(mot)){
                            motsTrouves.add(mot);
                            trouve=true;
                        }
                        else {
                            positionCurseur--;
                            motContruit += plateau.obtenirCase(positionCurseur ,positionDepartJ );
                        }
                    }
                }
            }

        }

    }

    public void rechercheSud(String clef, int positionDepartI, int positionDepartJ) {
        //On fait une requete au Dictionnaire pour savoir des mots commencent par ces 3 premieres lettres
        ArrayList<String> motsPossibles = dictionnaire.getListeMotsPossibles(clef);
        //Si des mots sont retournes on entame la recherche
        if(motsPossibles != null){
            for(String mot: motsPossibles){
                //verifer si assez de place pour faire la recherche
                if(mot.length()+positionDepartI <= plateau.getTaille()){
                    //on boucle tant que le mot construit par la grille correspond au mot
                    String motContruit = clef;
                    int positionCurseur = positionDepartI + 2;
                    boolean trouve =false;
                    while(mot.startsWith(motContruit) && !trouve){
                        if (motContruit.equals(mot)){
                            motsTrouves.add(mot);
                            trouve=true;
                        } else {
                            positionCurseur ++;
                            motContruit += plateau.obtenirCase(positionCurseur, positionDepartJ);
                        }
                    }
                }
            }

        }
    }
    public void rechercheNordEst(String clef, int positionDepartI, int positionDepartJ) {
//On fait une requete au Dictionnaire pour savoir des mots commencent par ces 3 premieres lettres
        ArrayList<String> motsPossibles = dictionnaire.getListeMotsPossibles(clef);
        //Si des mots sont retournes on entame la recherche
        if(motsPossibles != null){
            for(String mot: motsPossibles){
                //verifer si assez de place pour faire la recherche
                if(mot.length()+positionDepartJ <= plateau.getTaille() && positionDepartI-mot.length() >= -1){
                    //on boucle tant que le mot construit par la grille correspond au mot
                    String motContruit = clef;
                    int positionCurseurI = positionDepartI - 2;
                    int positionCurseurJ = positionDepartJ + 2;
                    boolean trouve =false;
                    while(mot.startsWith(motContruit) && !trouve){
                        if (motContruit.equals(mot)){
                            motsTrouves.add(mot);
                            trouve=true;
                        } else {
                            positionCurseurI --;
                            positionCurseurJ ++;
                            motContruit += plateau.obtenirCase(positionCurseurI, positionCurseurJ);
                        }
                    }
                }
            }

        }
    }

    public void rechercheNordOuest(String clef, int positionDepartI, int positionDepartJ) {
        //On fait une requete au Dictionnaire pour savoir des mots commencent par ces 3 premieres lettres
        ArrayList<String> motsPossibles = dictionnaire.getListeMotsPossibles(clef);
        //Si des mots sont retournes on entame la recherche
        if(motsPossibles != null){
            for(String mot: motsPossibles){
                //verifer si assez de place pour faire la recherche
                if(positionDepartI-mot.length() >= -1 && positionDepartI-mot.length() >= -1 ){
                    //on boucle tant que le mot construit par la grille correspond au mot
                    String motContruit = clef;
                    int positionCurseurI = positionDepartI-2;
                    int positionCurseurJ = positionDepartJ-2;
                    boolean trouve =false;
                    while(mot.startsWith(motContruit) && !trouve){
                        if (motContruit.equals(mot)){
                            motsTrouves.add(mot);
                            trouve=true;
                        }
                        else {
                            positionCurseurI--;
                            positionCurseurJ--;
                            motContruit += plateau.obtenirCase(positionCurseurI ,positionCurseurJ );
                        }
                    }
                }
            }

        }

    }

    public void rechercheSudOuest(String clef, int positionDepartI, int positionDepartJ) {
        //On fait une requete au Dictionnaire pour savoir des mots commencent par ces 3 premieres lettres
        ArrayList<String> motsPossibles = dictionnaire.getListeMotsPossibles(clef);
        //Si des mots sont retournes on entame la recherche
        if(motsPossibles != null){
            for(String mot: motsPossibles){
                //verifer si assez de place pour faire la recherche
                if(mot.length()+positionDepartI <= plateau.getTaille() && positionDepartJ-mot.length() >= -1){
                    //on boucle tant que le mot construit par la grille correspond au mot
                    String motContruit = clef;
                    int positionCurseurI = positionDepartI + 2;
                    int positionCurseurJ = positionDepartJ - 2;
                    boolean trouve =false;
                    while(mot.startsWith(motContruit) && !trouve){
                        if (motContruit.equals(mot)){
                            motsTrouves.add(mot);
                            trouve=true;
                        } else {
                            positionCurseurI ++;
                            positionCurseurJ --;
                            motContruit += plateau.obtenirCase(positionCurseurI, positionCurseurJ);
                        }
                    }
                }
            }

        }
    }

    public void rechercheSudEst(String clef, int positionDepartI, int positionDepartJ) {
        //On fait une requete au Dictionnaire pour savoir des mots commencent par ces 3 premieres lettres
        ArrayList<String> motsPossibles = dictionnaire.getListeMotsPossibles(clef);
        //Si des mots sont retournes on entame la recherche
        if(motsPossibles != null){
            for(String mot: motsPossibles){
                //verifer si assez de place pour faire la recherche
                if(mot.length()+positionDepartI <= plateau.getTaille() && mot.length()+positionDepartJ <= plateau.getTaille()){
                    //on boucle tant que le mot construit par la grille correspond au mot
                    String motContruit = clef;
                    int positionCurseurI = positionDepartI + 2;
                    int positionCurseurJ = positionDepartJ + 2;
                    boolean trouve =false;
                    while(mot.startsWith(motContruit) && !trouve){
                        if (motContruit.equals(mot)){
                            motsTrouves.add(mot);
                            trouve=true;
                        } else {
                            positionCurseurI ++;
                            positionCurseurJ ++;
                            motContruit += plateau.obtenirCase(positionCurseurI, positionCurseurJ);
                        }
                    }
                }
            }

        }
    }


}

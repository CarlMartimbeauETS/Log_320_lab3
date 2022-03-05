package laboratoire3;

import java.util.ArrayList;

public class app {
    public static void main(String args[]){

        MotMystere m = new MotMystere();
        String nomGrille = ".\\ressource\\grid_demo.txt";
        String nomDict = ".\\ressource\\dict_demo.txt";

        //N=8
        Chrono.start();
        String[] motsTrouves = m.Resoudre(nomGrille, nomDict);
        Chrono.stop();
        System.out.println("Liste de mots trouves");
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Grille N = 8");
        System.out.println("Temps d'exécution: " + Chrono.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche: " + m.getTempsDeRechercheMoyenMicroSec());

        //N=16
        nomGrille = ".\\ressource\\grid_demo2.txt";
        Chrono.start();
        motsTrouves = m.Resoudre(nomGrille, nomDict);
        Chrono.stop();
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Grille N = 16");
        System.out.println("Temps d'exécution: " + Chrono.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche: " + m.getTempsDeRechercheMoyenMicroSec());

        //N=32
        nomGrille = ".\\ressource\\grid_demo3.txt";
        Chrono.start();
        motsTrouves = m.Resoudre(nomGrille, nomDict);
        Chrono.stop();
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Grille N = 32");
        System.out.println("Temps d'exécution: " + Chrono.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche: " + m.getTempsDeRechercheMoyenMicroSec());

        //N=64
        nomGrille = ".\\ressource\\grid_demo4.txt";
        Chrono.start();
        motsTrouves = m.Resoudre(nomGrille, nomDict);
        Chrono.stop();
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Grille N = 64");
        System.out.println("Temps d'exécution: " + Chrono.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche: " + m.getTempsDeRechercheMoyenMicroSec());

    }
}

package laboratoire3;

import java.util.ArrayList;

public class app {
    public static void main(String args[]){

        MotMystere m = new MotMystere();
        String nomGrille = ".\\ressource\\grid_demo.txt";
        String nomDict = ".\\ressource\\dict_demo.txt";

        m.initComponents(nomGrille, nomDict); //*** Doit etre initialiser une fois avant d'appeler resoudre
        Chrono chronoApp= new Chrono();

        System.out.println("=== Dictionnaire 31 mots ===");

        //N=8
        System.out.println("[ Grille N = 8 ]");
        chronoApp.start();
        String[] motsTrouves = m.Resoudre(nomGrille, nomDict);
        chronoApp.stop();
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Temps d'exécution: " + chronoApp.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche (Micro Secondes): " + m.getTempsDeRechercheMoyenMicroSec());
        System.out.println("Nombre de recherches fructueuses: " + m.nbRechercheFructueuses());
        System.out.println("Nombre de mots possibles détectés: " + m.getNombreDeMotsPossible());
        System.out.println("Longueur moyenne des mots trouves: " + m.getLongueurMoyenneDesMotsTrouves());

        //N=16
        System.out.println("[ Grille N = 16 ]");
        nomGrille = ".\\ressource\\grid_demo2.txt";
        chronoApp.start();
        motsTrouves = m.Resoudre(nomGrille, nomDict);
        chronoApp.stop();
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Temps d'exécution: " + chronoApp.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche (Micro Secondes): " + m.getTempsDeRechercheMoyenMicroSec());
        System.out.println("Nombre de recherches fructueuses: " + m.nbRechercheFructueuses());
        System.out.println("Nombre de mots possibles détectés: " + m.getNombreDeMotsPossible());
        System.out.println("Longueur moyenne des mots trouves: " + m.getLongueurMoyenneDesMotsTrouves());

        //N=32
        System.out.println("[ Grille N = 32 ]");
        nomGrille = ".\\ressource\\grid_demo3.txt";
        chronoApp.start();
        motsTrouves = m.Resoudre(nomGrille, nomDict);
        chronoApp.stop();
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Temps d'exécution: " + chronoApp.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche (Micro Secondes): " + m.getTempsDeRechercheMoyenMicroSec());
        System.out.println("Nombre de recherches fructueuses: " + m.nbRechercheFructueuses());
        System.out.println("Nombre de mots possibles détectés: " + m.getNombreDeMotsPossible());
        System.out.println("Longueur moyenne des mots trouves: " + m.getLongueurMoyenneDesMotsTrouves());

        //N=64
        System.out.println("[ Grille N = 64 ]");
        nomGrille = ".\\ressource\\grid_demo4.txt";
        chronoApp.start();
        motsTrouves = m.Resoudre(nomGrille, nomDict);
        chronoApp.stop();
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Temps d'exécution: " + chronoApp.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche (Micro Secondes): " + m.getTempsDeRechercheMoyenMicroSec());
        System.out.println("Nombre de recherches fructueuses: " + m.nbRechercheFructueuses());
        System.out.println("Nombre de mots possibles détectés: " + m.getNombreDeMotsPossible());
        System.out.println("Longueur moyenne des mots trouves: " + m.getLongueurMoyenneDesMotsTrouves());

        //N=128
        System.out.println("[ Grille N = 128 ]");
        nomGrille = ".\\ressource\\grid_demo5.txt";
        chronoApp.start();
        motsTrouves = m.Resoudre(nomGrille, nomDict);
        chronoApp.stop();
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Temps d'exécution: " + chronoApp.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche (Micro Secondes): " + m.getTempsDeRechercheMoyenMicroSec());
        System.out.println("Nombre de recherches fructueuses: " + m.nbRechercheFructueuses());
        System.out.println("Nombre de mots possibles détectés: " + m.getNombreDeMotsPossible());
        System.out.println("Longueur moyenne des mots trouves: " + m.getLongueurMoyenneDesMotsTrouves());

        System.out.println("=== Dictionnaire 37 mots ===");
        nomDict = ".\\ressource\\dict_demo2.txt";

        //N=8
        System.out.println("[ Grille N = 8 ]");
        nomGrille = ".\\ressource\\grid_demo.txt";
        chronoApp.start();
        motsTrouves = m.Resoudre(nomGrille, nomDict);
        chronoApp.stop();
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Temps d'exécution: " + chronoApp.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche (Micro Secondes): " + m.getTempsDeRechercheMoyenMicroSec());
        System.out.println("Nombre de recherches fructueuses: " + m.nbRechercheFructueuses());
        System.out.println("Nombre de mots possibles détectés: " + m.getNombreDeMotsPossible());
        System.out.println("Longueur moyenne des mots trouves: " + m.getLongueurMoyenneDesMotsTrouves());

        //N=16
        System.out.println("[ Grille N = 16 ]");
        nomGrille = ".\\ressource\\grid_demo2.txt";
        chronoApp.start();
        motsTrouves = m.Resoudre(nomGrille, nomDict);
        chronoApp.stop();
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Temps d'exécution: " + chronoApp.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche (Micro Secondes): " + m.getTempsDeRechercheMoyenMicroSec());
        System.out.println("Nombre de recherches fructueuses: " + m.nbRechercheFructueuses());
        System.out.println("Nombre de mots possibles détectés: " + m.getNombreDeMotsPossible());
        System.out.println("Longueur moyenne des mots trouves: " + m.getLongueurMoyenneDesMotsTrouves());

        //N=32
        System.out.println("[ Grille N = 32 ]");
        nomGrille = ".\\ressource\\grid_demo3.txt";
        chronoApp.start();
        motsTrouves = m.Resoudre(nomGrille, nomDict);
        chronoApp.stop();
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Temps d'exécution: " + chronoApp.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche (Micro Secondes): " + m.getTempsDeRechercheMoyenMicroSec());
        System.out.println("Nombre de recherches fructueuses: " + m.nbRechercheFructueuses());
        System.out.println("Nombre de mots possibles détectés: " + m.getNombreDeMotsPossible());
        System.out.println("Longueur moyenne des mots trouves: " + m.getLongueurMoyenneDesMotsTrouves());

        //N=64
        System.out.println("[ Grille N = 64 ]");
        nomGrille = ".\\ressource\\grid_demo4.txt";
        chronoApp.start();
        motsTrouves = m.Resoudre(nomGrille, nomDict);
        chronoApp.stop();
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Temps d'exécution: " + chronoApp.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche (Micro Secondes): " + m.getTempsDeRechercheMoyenMicroSec());
        System.out.println("Nombre de recherches fructueuses: " + m.nbRechercheFructueuses());
        System.out.println("Nombre de mots possibles détectés: " + m.getNombreDeMotsPossible());
        System.out.println("Longueur moyenne des mots trouves: " + m.getLongueurMoyenneDesMotsTrouves());

        //N=128
        System.out.println("[ Grille N = 128 ]");
        nomGrille = ".\\ressource\\grid_demo5.txt";
        chronoApp.start();
        motsTrouves = m.Resoudre(nomGrille, nomDict);
        chronoApp.stop();
        System.out.println("Mots trouves: " + motsTrouves.length);
        System.out.println("Temps d'exécution: " + chronoApp.timeInSec());
        System.out.println("Nombre de recherches effectues: " + m.getNombreDeRecherche());
        System.out.println("Temps moyen de recherche (Micro Secondes): " + m.getTempsDeRechercheMoyenMicroSec());
        System.out.println("Nombre de recherches fructueuses: " + m.nbRechercheFructueuses());
        System.out.println("Nombre de mots possibles détectés: " + m.getNombreDeMotsPossible());
        System.out.println("Longueur moyenne des mots trouves: " + m.getLongueurMoyenneDesMotsTrouves());

    }
}

package laboratoire3;

import java.util.ArrayList;

public class app {
    public static void main(String args[]){

        MotMystere m = new MotMystere();
        String nomGrille = ".\\ressource\\grid_demo.txt";
        String nomDict = ".\\ressource\\dict_demo.txt";

        String[] motsTrouves = m.Resoudre(nomGrille, nomDict);
        System.out.println("Liste de mots trouves");

        for(String mot: motsTrouves){
            System.out.println(mot);

        }


    }
}

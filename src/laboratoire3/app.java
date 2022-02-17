package laboratoire3;

import java.util.ArrayList;

public class app {
    public static void main(String args[]){

        MotMystere m = new MotMystere();
        String nomGrille = ".\\ressource\\grid_demo.txt";
        String nomDict = ".\\ressource\\dict_demo.txt";
        //m.initComponents(nomGrille, nomDict);
        //m.rechercheEst("cas",0,0 );
        m.Resoudre(nomGrille, nomDict);
        System.out.println("Liste de mots toruves");
        for(String mot: m.motsTrouves){
            System.out.println(mot);
        }

    }
}

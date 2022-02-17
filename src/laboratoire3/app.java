package laboratoire3;

public class app {
    public static void main(String args[]){

        MotMystere m = new MotMystere();
        String nomGrille = ".\\ressource\\grid_demo.txt";
        String nomDict = ".\\ressource\\dict_demo.txt";
//        m.Resoudre(nomGrille, nomDict);
//        //System.out.println("TESTTTTT");
//        //System.out.println(m.dictionnaire.getListeMotsPossibles("plu").size());
//        String x = "pluie";
//        String y = "pluiex";
//        //System.out.println(x.startsWith(y));
//        //System.out.println(m.dictionnaire.dictionnaire("plu"));

        m.initComponents(nomGrille, nomDict);

        m.rechercheEst("cas",0,0 );
        System.out.println("Liste de mots toruves");
        for(String mot: m.motsTrouves){
            System.out.println("MOt");
        }

    }
}

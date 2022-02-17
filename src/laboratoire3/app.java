package laboratoire3;

public class app {
    public static void main(String args[]){

        MotMystere m = new MotMystere();
        String nomGrille = ".\\ressource\\grid_demo.txt";
        String nomDict = ".\\ressource\\dict_demo.txt";
        m.Resoudre(nomGrille, nomDict);


    }
}

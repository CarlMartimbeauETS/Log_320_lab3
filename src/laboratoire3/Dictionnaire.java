package laboratoire3;

import java.io.*;
import java.util.*;

public class Dictionnaire {
    HashMap<String, ArrayList<String>> dictionnaire;

    public Dictionnaire(String file){
        try {
            initComponents(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initComponents(String file) throws IOException {

            FileInputStream fis = new FileInputStream(file);
            //Lire dictionnaire et mettre les différents mots
            dictionnaire= new HashMap<>();
            int input;
            String mot = ""; String key="";
            while ((input = fis.read()) !=-1){
                if ((char) input== '\n'){
                    System.out.println(mot);
                    dictionnaire.get(key).add(mot);
                    mot="";

                }else {
                mot+=(char) input;
                if (mot.length()==3) {
                    key = mot;
                    if (dictionnaire.get(key) == null) {
                        dictionnaire.put(key, new ArrayList<>());
                    }
                }

                }
            }
        for(Map.Entry<String, ArrayList<String>> entry : dictionnaire.entrySet()) {
            Collections.sort(entry.getValue());
        }
    }
}

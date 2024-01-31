import java.util.*;
import java.util.ArrayList;


public class Paquet {

    public Paquet(){
    }
    ArrayList<Carte> listedecarte = new ArrayList<>();
   public void remplirPaquet(){

    for (Ecouleur couleur : Ecouleur.values()){
        for (Evaleur valeur : Evaleur.values()){

            listedecarte.add(new Carte (couleur, valeur));
        }
        }
    }
    public void melangerPaquet(){
        Collections.shuffle(listedecarte);
    }

    public void trierPaquet(){

    }

    @Override
    public String toString() {
        return "Paquet{" +
                "listedecarte=" + listedecarte +
                '}';
    }
    public void haha(){}
}
git 
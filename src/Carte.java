public class Carte {

    private Ecouleur couleur;
    private Evaleur valeur;

    public Carte(Ecouleur couleur, Evaleur valeur){
        this.valeur = valeur;
        this.couleur = couleur;

    }

    public Ecouleur getCouleur(){
        return couleur;
    }
    public Evaleur getValeur(){
        return valeur;
    }
    public void setCouleur(Ecouleur couleur){
        this.couleur = couleur;
    }
    public void setValeur(Evaleur valeur){
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "couleur=" + couleur +
                ", valeur=" + valeur +
                '}';
    }
}

public class Méthode_utile {
    public static void main(String[] args){
        System.out.println("Ce document a pour but de répertorié des méthodes que je pense être utilisé fréquemment.\nCela va éviter de perdre du temps et enrichir ma base de connaissance personnel.\nBon visionnage! :)");
    }
    static int genNbAleatoireEntreDeuxNb(int min,int max){
        int nbAleatoire;
        nbAleatoire = (int)(Math.random()*(max-min +1))+ min;
        return nbAleatoire;
    }

}

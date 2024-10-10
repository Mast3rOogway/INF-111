public class Lab3Ex2 {
    public static void  main (String[] args){
        System.out.println(getNbAleatoireEntre(1,10));

    }
    static int getNbAleatoireEntre(int min,int max){
        int nbAleatoire;
        nbAleatoire = (int)(Math.random()*(max-min +1))+ min;
        return nbAleatoire;
    }

}

import java.util.Arrays;
import java.util.Random;

public class Lab3Ex2 {
    public static void  main (String[] args){
        //Appel getNbAleatoireEntre
        //System.out.println("Nombre aleatoire: "+getNbAleatoireEntre(1,10));
        // Appel remplirAleatoirement
        /*
        int [] remplirRandom;
        remplirRandom = new int[10];
        remplirAleatoirement(remplirRandom,1,50);
        //Appel getInverse
        getInverse(remplirRandom);
        //Appel Inverse
        Inverse(remplirRandom);
        //Appel getNouveauTableau
        getNouveauTableau(10,1,100);

         */
        // Appel fusion
        fusion(getNouveauTableau(10,1,30),getNouveauTableau(10,1,30));

    }
    static int getNbAleatoireEntre(int min,int max){
        int nbAleatoire;
        nbAleatoire = (int)(Math.random()*(max-min +1))+ min;
        return nbAleatoire;
    }
    static void remplirAleatoirement(int [] tableauNbAleatoire,int min, int max){

        for (int i =0; i < tableauNbAleatoire.length; i ++){
            tableauNbAleatoire[i] = getNbAleatoireEntre(min,max);
        }
        System.out.println("Tableau rempli : "+ Arrays.toString(tableauNbAleatoire));
    }
    static int [] getInverse (int [] tableauRecu){
        System.out.println("---------Methode getInverse------------");
        System.out.println("tableau recu: "+Arrays.toString(tableauRecu));
        int [] tableauInverse;
        tableauInverse = new int [10];
        for (int i=0, j=tableauRecu.length-1; j>=0;i++,j--){
            int temp;
            temp = tableauRecu[i];
            tableauInverse[j] = temp;
        }
        System.out.println(Arrays.toString(tableauInverse));
        return tableauInverse;
    }
    static void Inverse(int[] tableauRecu){
        int [] inverse = new int [10];
        System.out.println("------------Methode inverse-----------");
        System.out.println("tableau recu: "+ Arrays.toString(tableauRecu));
        for (int i=0,j=tableauRecu.length-1;j >=0;i++,j--){
            int temp;
            temp = tableauRecu[i];
            inverse[j]=temp;
        }
        tableauRecu = inverse;
        System.out.println("tableau inverse: "+Arrays.toString(tableauRecu));
    }
    static int [] getNouveauTableau(int tailleTableau,int min, int max){
        int [] tableauCool = new int [tailleTableau];
        remplirAleatoirement(tableauCool,min,max);
        return tableauCool;
    }
    static int [] fusion(int [] tableau1, int [] tableau2){
        int [] prout = new int [tableau1.length+tableau2.length];
        //inserer les variables
        for (int i = 0;i< tableau1.length;i++){
            prout[i]=tableau1[i];
        }
        for (int i = 0; i < tableau2.length;i++){
            prout[tableau1.length+i] = tableau2[i];
        }
        //trier le tableau
        int passage = 0,temp;
        boolean permutationFaite = true;
        while (permutationFaite){
            permutationFaite = false;
            passage++;
            for (int i=0;i<prout.length-passage;i++){
                if (prout[i]>prout[i+1]){
                    temp = prout [i];
                    prout[i]=prout[i+1];
                    prout[i+1] = temp;
                    permutationFaite = true;
                }
            }
        }
        System.out.println("fusion: "+Arrays.toString(prout));
        return prout;
    }
}

public class TriÀBulle {
    public static void main(String[] args){

        int [] test;
        test = new int[10];

        for (int i = 0; i < test.length; i++){
            test[i] = (int)(Math.random()*100);
        }
        System.out.println("Avant tri");
        for (int i = 0; i < test.length; i++){
            System.out.print(test[i] + " ");
        }

        triABulles(test);

        System.out.println("Apres tri");
        for (int i = 0; i < test.length; i++){
            System.out.print(test[i] + " ");
        }

    }


    public static void triABulles (int[] tab){
        int passage = 0;
        boolean permutationEffectuee = true;
        int i,temp;
        while(permutationEffectuee){
            permutationEffectuee = false;
            passage++;
            for (i=0;i<tab.length-passage;i++){
                if (tab[i] > tab[i+1]) {
                    temp = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = temp;
                    permutationEffectuee = true;
                }
            }
        }
    }
}




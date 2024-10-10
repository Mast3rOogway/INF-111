import java.util.Scanner;
public class Lab1Ex1 {
    public static void main(String[] arg){
        Scanner clavier;
        clavier = new Scanner(System.in);
        double celsius,farheneiht;
        System.out.println("Entrer une temperature en C");
        celsius = clavier.nextInt();
        farheneiht = (celsius * 1.8)+32;
        System.out.println("la valeur en farenh.. est: "+farheneiht);
    }
}

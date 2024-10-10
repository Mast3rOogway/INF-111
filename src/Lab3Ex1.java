import java.util.Scanner;
public class Lab3Ex1 {
    public static void main(String[] args){
        double tEnC,tEnF;
        Scanner clavier;
        clavier = new Scanner(System.in);
        System.out.print("Entrer une valeur en C, on va la transformer en F:");
        tEnC = clavier.nextDouble();

        System.out.print("Entrer une valeur en F, on va la transformer en C:");
        tEnF = clavier.nextDouble();

    System.out.println(tEnC +" en F= :" +cel2Fah(tEnC));
    System.out.println(tEnF +" en C = :" + fah2Cel(tEnF));
    }
    public static double cel2Fah(double temp){
        double fahrenheit;
        fahrenheit = (temp * 1.8)+32;
        return fahrenheit;
    }
    public static double fah2Cel(double temp){
        double celcius;
        celcius = (temp - 32) * 5/9;
        return celcius;
    }
}

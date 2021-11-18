package GitHub_Work.KilometresToMiles;
import java.util.Scanner;

public class KilometresToMiles {
    public static void main(String[] args) {
        double kilometers;
        System.out.println("enter the kilometers: ");
        Scanner in = new Scanner(System.in);
        kilometers = in.nextDouble();
        double miles = kilometers / 1.609;
        System.out.println(miles + " miles");
        in.close();
    }    
}   
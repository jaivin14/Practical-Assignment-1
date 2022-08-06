// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Aim : 
// Develop a Program that illustrate method overloading concept.
import java.util.Scanner;

public class p5_A_methodoverloadingMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p5_A_methodoverloading obj = new p5_A_methodoverloading();
        System.out.println("Enter the radius of circle :");
        float rad = sc.nextFloat();

        obj.Area(rad);

        System.out.println("Enter the length and width of the rectangle : ");
        float len = sc.nextFloat();
        float width = sc.nextFloat();

        obj.Area(len,width);
    }


}
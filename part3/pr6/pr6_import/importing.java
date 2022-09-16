package pr6_import;
import java.util.*;
public class importing {
    int number;

    public void set() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        number = sc.nextInt();
        sc.close();
    }

    public void get() {
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println(+number + " is even number");
            } else {
                System.out.println(+number + " is odd number");
            }
        }
        else
        {
            System.out.println("Enter the non-zero number");
        }
    }
}

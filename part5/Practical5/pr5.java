// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

//

package part5.Practical5;

import java.io.*;
import java.util.*;

public class pr5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        FileWriter f;
        try {
            f = new FileWriter("Pr_5_5.txt"); 
            BufferedWriter bf = new BufferedWriter(f); // BufferedWriter to write the data in the file
            for (int i = 0; i < arr.length; i++) { 
                if (arr[i] % 2 == 0) {
                    bf.write(arr[i] + " ");
                }
            }
            bf.close(); // close() function to close the stream
        } catch (IOException e) {
            e.printStackTrace(); // prints exception if any occurs
        }

        FileReader fr = new FileReader("Pr_5.txt"); // FileReader to read the data from the file
        BufferedReader br = new BufferedReader(fr); // BufferedReader to read the data from the file
        String Int_line;

        while ((Int_line = br.readLine()) != null) {
            String In_Value = Int_line;
            // Print the Integer
            System.out.println(In_Value);
        }
        br.close();
        sc.close();
    }
}

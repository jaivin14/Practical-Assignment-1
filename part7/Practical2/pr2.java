// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

/*       
Write a program that counts the occurrences of words in a text and displays the words
and their occurrences in alphabetical order of the words. Using Map and Set Classes.
*/

package part7.Practical2;

// import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class pr2 {
    public static void main(String[] args)
    {
 
        // Declaring the String
        String str = "My name is Jaivin Savaliya";
        // Declaring a HashMap of <String, Integer>
        Map<String, Integer> hashMap = new HashMap<>();
 
        // Splitting the words of string and storing them in the array.
        String[] words = str.split(" ");
 
        for (String word : words) {
 
            // Asking whether the HashMap contains the key or not. Will return null if not.
            Integer integer = hashMap.get(word);
 
            if (integer == null)
                // Storing the word as key and its occurrence as value in the HashMap.
                hashMap.put(word, 1);
 
            else {
                // Incrementing the value if the word is already present in the HashMap.
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}

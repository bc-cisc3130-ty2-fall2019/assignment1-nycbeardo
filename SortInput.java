/******************************************************************************
 *  Montique Stevens | 12234616
 *  _Example commands for running this file_
 *  Compilation:  javac Assignment1.java
 *  Execution:    java Assignment1 < input.txt
 *
 *  Reads in a text file and for each line verifies whether the word has
 *  unique characters.
 *
 *  % cat input.txt
 *  Hello
 *  World
 *
 *  % java Assignment1 < input.txt
 *  False
 *  True
 *
 ******************************************************************************/






import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.HashSet; 
import java.util.Scanner; 

public class SortInput {

    /* a function for checking uniqueness of characters in a word */
    private static boolean isUniqueChar(String s){
        // Fill this part out
        
        //this determines if we have encountered 2 of the same characters and what to do when condition is set
         for (int i = 0; i < s.length(); i++) 
            for (int j = i + 1; j < s.length(); j++) 
                if (s.charAt(i) == s.charAt(j)) 
                   return false; 
             boolean isUnique = true;
           			isUnique = false;
                    
                    
        System.out.println(true);
        return true;
    }
    
    /* a function for sorting an input word */
    private static String sortWord(String s){
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        insertionSort(c);
        return s; // should return words in different order
    }

    /* insertion sort algorithm. It should return a string type */
    public static void insertionSort(char[] word) {
        if (word == null || word.length == 0)
            return; // empty array have nothing to sort

        for (int i=0; i < word.length; i++) {
            char temp = word[i];
            int j = i;
            while (j > 0 && word[j-1] > temp) {
                word[j] = word[j-1];
                j--;
            }
            word[j] = temp;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read in words and determine whether it is composed of unique characters
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            
            isUniqueChar(s);
            sortWord(s);
        }

      scanner.close();
    }
}

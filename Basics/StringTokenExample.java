import java.util.*;

public class StringTokenExample {

    public static void main(String[] args) {
      
        // Example with Constructor 1
        System.out.println("Using StringTokenizer Constructor 1: ");

        // Using StringTokenizer to split the string into 
        // tokens using space (" ") as the delimiter
        StringTokenizer st1 = new StringTokenizer(
            "Geeks fo Geeks", " ");

        // Iterate through tokens while 
        // there are more tokens available
        while (st1.hasMoreTokens())
          
            // Getting and printing the next token
            System.out.println(st1.nextToken());

        // Example with Constructor 2
        System.out.println("Using StringTokenizer Constructor 2: ");

        // Using StringTokenizer to split the string 
        // using ":" as the delimiter
        StringTokenizer st2 = new StringTokenizer(
            "java : Code : String : Tokenizer", " :");

        // Iterate through tokens and print them
        while (st2.hasMoreTokens())
            System.out.println(st2.nextToken());

        // Example with Constructor 3
        System.out.println("Using StringTokenizer Constructor 3: ");

        // Using StringTokenizer with returnDelims = true 
        // to include delimiters as tokens
        StringTokenizer st3 = new StringTokenizer(
            "java : Code", " :", true);

        // Iterate through tokens (including delimiters) 
        // and print them
        while (st3.hasMoreTokens())
            System.out.println(st3.nextToken());
    }
}
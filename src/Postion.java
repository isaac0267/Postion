import java.util.Scanner;

public class Postion {
    // this project is about how to make the programme to finde the postion of the word and vowels and consonance.
    // I will use the static
    // I will use the for loop.
    // I wil use the charAt.
    // I will use the scanner to take the input form the user.
    // I will convert to lowercase.
    public static final int NUM=31;
    static void postion(String str,int n){
        for (int i=0; i<str.length();i++){
            System.out.println(str.charAt(i)&NUM);
        }
    }
    public static void main(String[] args) {
        boolean keepRun=true;
        Scanner input = new Scanner(System.in);
        do {
            int vowels_count, cons_Count; // use the int as the data type. and give it name.
            vowels_count = 0; // initialized them both.
            cons_Count = 0;
            String words = "";
            System.out.println("Enter your option:");
             // use the scanner and save the user input inside.
            words = input.nextLine(); // save the user answer or input.
            words = words.toLowerCase();
            for (int i = 0; i < words.length(); i++) { // make the for loop, for finde the word that need to count.
                char ch = words.charAt(i); // insted of using the charAt(i), I can just use the ch, bacuse i save it in the char.
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o') {
                    vowels_count++;
                } else if ((ch >= 'a' || ch <= 'Z')) {
                    cons_Count++;
                }
            }
            int n = words.length(); // this code I will use to find the postion of the letters in the words.
            postion(words, n); //
            System.out.println("The total number of the vowels:" + vowels_count); // to print the
            System.out.println("The total number of the consonance: " + cons_Count);
        } while (keepRun);
    }
}
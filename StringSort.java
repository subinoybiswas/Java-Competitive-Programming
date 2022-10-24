import java.util.Scanner;

public class StringSort {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string? ");
        String n = in.nextLine(), y = "";
        System.out.println(n);
        n = n.toLowerCase();
        System.out.println("String in lowercase: " + n);
        for(char i = 'a' ; i <= 'z' ; i++) {
            for(int j = 0 ; j < n.length() ; j++) {
                char letter = n.charAt(j);
                if(letter == i) {
                    y += letter;
                }
            }
        }
        System.out.println("String letters sorted in alphabetic order: " + y);
    }
}

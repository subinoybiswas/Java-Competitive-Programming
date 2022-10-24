import java.util.Scanner;

public class isFibonacci {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number? ");
        
        boolean isFibo = false;
        int n = in.nextInt(), a = 0, b = 1, c = 0;
        
        while(c <= n) {
            if(c == n){
                isFibo = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }
        
        if(isFibo) {
            System.out.println(n + " is a fibonacci number.");
        }
        else {
            System.out.println(n + " is not a fibonacci number");
        }
    }
}

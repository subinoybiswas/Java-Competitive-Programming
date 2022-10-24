import java.util.Scanner;
public class reverseNum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num);
        
        int c=num, digit=0, reverseNumber=0;
        while(c > 0)
        {
            digit = c % 10;
            reverseNumber = (reverseNumber*10) + digit;
            c /= 10;
        }
        System.out.println("The reverse number is " + reverseNumber);
    }
}

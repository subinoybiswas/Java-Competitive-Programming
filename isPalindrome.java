
import java.util.Scanner;
public class palindromeNo
{
    public static void main(String args[])
    {
        // 121 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber : ");
        int num = sc.nextInt();int temp=num;int d=0;int s=0;
        while(temp > 0)
        {
            d = temp % 10;
            s = (s*10) + d;
            temp /= 10;
        }
        if(s == num)
        {
            System.out.println("Yes Its a palindrome....");
        }
        else
        {
            System.out.println("NO Its not a palindrome....");
        }
    }
}

import java.util.Scanner;
public class pig
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next().toUpperCase(); String Newstr="";           
        String v="AEIOU";
        for(int i=0;i<str.length();i++)
        {
            if(v.indexOf(str.charAt(i)) >= 0){
                Newstr = str.substring(i) + str.substring(0 , i) + "AY";
                break;
            }
        }
        System.out.println("New String -> "+Newstr);
    }
}


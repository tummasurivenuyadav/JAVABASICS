import java.util.*;
public class WhileEx{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= s.nextInt();
        while(n<=10)
        {
            for (int i=1;i<=10;i++)
            {
                int result=(n*1);
                System.out.println( n +" x "+ i +" = " + result);
            }
            n++;
        }
    }
}
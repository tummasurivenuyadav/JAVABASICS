import java.util.*;
public class AtmPin{
    public static void main(String[]args)
    {
        final int correctpin = 9100;
        int attempts = 3;
        Scanner s = new Scanner(System.in);
        
        while (attempts>0)
        {
            System.out.println("enter your ATM PIN : ");
            int enteredpin = s.nextInt();

            if (enteredpin == correctpin) {
                System.out.println(" PIN is verified successfully. Access Granted");
                s.close();
                return;
            } 
            else{
                attempts --;
                if (attempts > 0){
                    System.out.println(" WARNING............Incorrect pin. You have more" + attempts + "attempts left ");
                
                }
                else
                {
                    System.out.println("Incorrect pin. You have reached maximum number of attempts, TRY AGAIN AFTER 24HOURS.");
                }
            }
        }
    }
}
interface UPIPayment
{
    void upiTransfer();
}

interface CreditCardPayment
{
void cardTransfer();
}

class PaymentGateway implements UPIPayment,CreditCardPayment
{
   public void UpiTransfer()
   {
    System.out.println("UPI Payment Successful!!!!!");
   } 
   void CardTransfer()
   {
    System.out.println("CreditCard Payment Successful!!!!!");
   } 


}

public class InterfaceEx
{
    public static void main(String[] args) {
        PaymentGateway obj= new PaymentGateway();
        obj.UpiTransfer();
        obj.CardTransfer();

    }
}
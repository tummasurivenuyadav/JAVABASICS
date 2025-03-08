abstract class Database
{
    abstract void connecting();
    void disconnect()
    {
        System.out.println("disconnected");
    }
}
class Mydata extends Database
{
    void connecting()
    {
        System.out.println("the system is connecting");
    }
}
public class Abstract2Ex
{
    public static void main(String[] args) {
        Mydata md = new Mydata();
        md.connecting();
        md.disconnect();
    }
}
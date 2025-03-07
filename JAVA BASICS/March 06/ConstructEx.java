public class ConstructEx{
    String name;
    long num;
    ConstructEx()
    {
        name="Venu yadav";
        num=9100494631L;
    }
    void show()
    {
        System.out.println(name + " " + num);
    }
    
    public static void main(String[] args)
{
    ConstructEx obj = new ConstructEx();
    obj.show();
}
}
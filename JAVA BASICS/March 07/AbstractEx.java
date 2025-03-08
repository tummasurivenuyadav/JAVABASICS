
abstract class Trainer
{
    abstract void Teach();
}
class Student extends Trainer
{
    void Teach()
   {
    System.out.println("training is going on!!!!");
   }
}
public class AbstractEx
{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.Teach();
    }
}
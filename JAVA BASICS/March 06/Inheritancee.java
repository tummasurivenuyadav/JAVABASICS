public class Inheritancee 
{
    void speak(){
        System.out.println("yes students will speaks");
    }
}

class Teacher extends Inheritancee
{
    void teach(){
        System.out.println("yes they are teachers");
    }
class Principal extends Teacher{
    void talk(){
        System.out.println("yes they are principal");
    }

    public static void main(String[] args)
     {
        Principal obj = new Principal();
        
        obj.speak();
        obj.teach();
        obj.talk();
    }
}
}
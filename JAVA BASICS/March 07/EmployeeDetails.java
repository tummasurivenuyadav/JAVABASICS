abstract class Employee
{
    String name;
    int employeeId;
    public Employee(String name , int employeeId)
    {
        this.name = name;
        this.employeeId = employeeId;
    }
    abstract void calculatesalary();
    public void showdetails()
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: "+ name);
    }
}

class FullTimeEmployee extends Employee
{
    int salary = 50000;
    public FullTimeEmployee(String name,int employeeId)
    {
        super(name,employeeId);

    }
    void calculatesalary()
    {
        showdetails();
        System.out.println("Salary: $" + salary);
        System.out.println();
    }
}

class PartTimeEmployee extends Employee
{
    int hoursworked;
    private final int rateperhour = 500;
    public PartTimeEmployee(String name , int employeeId, int hoursworked)
    {
        super(name, employeeId);
        this.hoursworked = hoursworked;
    }

    void calculatesalary()
    {
        int salary = hoursworked * rateperhour;
        showdetails();
        System.out.println("Salary : $" + salary);
        System.out.println();
    }
}

public class EmployeeDetails
{
    public static void main(String[]args){
        FullTimeEmployee emp1 = new FullTimeEmployee("Venu yadav",101);
        PartTimeEmployee emp2 = new PartTimeEmployee("Abhi",102,10);
        emp1.calculatesalary();
        emp2.calculatesalary();
    }
}
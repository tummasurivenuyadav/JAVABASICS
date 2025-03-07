class Student {
    private String name;
    private int rollNumber;
    private char grade;

    
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

   
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

   
    public static void main(String[] args) {
        Student student1 = new Student("Ramya", 156, 'A');
        student1.displayDetails();
    }
}


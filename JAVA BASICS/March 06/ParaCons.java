class ParaCons {
    String name;
    int age;

    ParaCons(){
        name = "Venu Yadav";
        age = 22;
    }
    
    public ParaCons(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ParaCons s1 = new ParaCons();
        s1.display();
    }
}

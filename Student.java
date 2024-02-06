public class Student {
    private String firstname;
    private int age;
    private String lastname;
    
    public Student(String n, int a, String l) {
        this.firstname = n;
        this.age = a;
        this.lastname = l;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastname;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String n) {
        this.firstname = n;
    }

    public void setLastName(String n) {
        this.lastname = l;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public static void main(String[] args) {
        Student b = new Student("Bob", 21, "Mauwad");
        System.out.println("The name of the student is " + b.getFirstName() + " " + b.getlastName() + " and the age is " + b.getAge());
        
        // Changing the name and age using the setter methods
        b.setFirstName("John");
        b.setLastName("Doe");
        b.setAge(19);
        System.out.println("The updated name of the student is " + b.getName() + " and the age is " + b.getAge());
    }
}

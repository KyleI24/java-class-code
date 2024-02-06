// Name: Kyle Intendencia
// Program: Person.java
// Date: January 31, 2024
// Description: creates functions to get/set name age and gender with a introduce function to display said variables

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {// Getter function for name
        return name;
    }
    
    public void setName(String newName) { // Setter function for name
        this.name = newName;
    }

    public int getAge() { // Getter for age
        return age;
    }

    public void setAge(int age) { // Setter for age
        this.age = age;
    }

    public char getGender() { // Getter for gender
        return gender;
    }

    public void setGender(char gender) { // Setter for gender
        this.gender = gender;
    }

    public void introduce() {// introduce function to display name, age, and gender
        System.out.println("Name: " + name + " Age: " + age + " Gender: " + gender);
    }
    public static void main(String[] args) {// scanner to obtain name, age, and gender to store into their variables
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name1 = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age1 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter Gender: ");
        char gender1 = scanner3.next().charAt(0);
        Person Student = new Person(name1, age1, gender1);// prints all inputted scanner data using the introduce function
        Student.introduce();
    }
}
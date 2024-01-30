import java.util.Scanner;

public class example2 {
    public static void sayHello(String Name) {
        System.out.println("Hello! " + Name);
    }
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);// defining a scanner to input your name
        System.out.println("Enter Your Name: ");
        String input_name = scanner.nextLine();
        scanner.close();

        String name = "John";
        sayHello(name);
        sayHello("Akabane");
        sayHello(input_name);// calling the scanners variable to be used in the sayHello function
    }
}

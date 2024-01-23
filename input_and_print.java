import java.util.Scanner;

class InputPrint { 
    public static void main(String args[]) 
    { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        //code to ask the durham id number
        String name = scanner.nextLine();
        System.out.println("Hello, World " + name + ". Welcome to Durham College class on OOPS");
        scanner.close();
    } 
}
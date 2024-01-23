import java.util.Scanner;

class ConditionalPrint { 
    public static void main(String args[]) 
    { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        String message = "Hey there " + name + ". Welcome to Durham College class on OOPS. ";

        if (age < 25) {
            message += "you are a poor person. Durham will give you some hope";
        } else if (age >= 25 && age < 45) {
            message += "Youre actually a poor person who has some hope left.";
        } else if (age >= 45 && age < 60) {
            message += "Buddy you have given up. Durham will just add to your infinite melancholy";
        } else {
            message += "You are now at peace with your poverty.";
        }

        System.out.println(message);
        scanner.close();
    } 
}
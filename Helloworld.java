import java.util.Scanner;


class Helloworld {
    public static void main(String[] args) {
      try (Scanner Scanner = new Scanner(System.in)) {
        System.out.println("Enter your name: ");
        String name = Scanner.nextLine();
        
      try (Scanner Scanner1 = new Scanner(System.in)) {
        System.out.println("Enter your Age: ");


        Integer age = Integer.valueOf(Scanner1.nextLine());
        if (age < 25) {
        System.out.println("Hey there " + name + ". Welcome to Durham College class on OOPS. You are young and full of possibilites!");
        } else if (age >= 25 && age <= 45) {
        System.out.println("Hey there " + name + ". Welcome to Durham College class on OOPS. 40s is the new 20s!");
        } else if (age >= 46 && age <=60) {
        System.out.println("Hey there " + name + ". Welcome to Durham College class on OOPS. It is never too late to start!");
        }
      }
    }
  }
}
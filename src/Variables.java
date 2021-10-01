import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        boolean happy = false;
        System.out.println("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Please enter no of cards: ");
        int age = sc.nextInt();
        System.out.println("Are you happy (y/n): ");
        String happier = sc.nextLine();
        if(happier == "y") {
            happy = true;
        } else if(happier == "n") {
            happy = false;
        } else {
            System.out.println("Invalid Input!!!!!!");
            happy = false;
        }
        System.out.println("Please enter change : ");
        double change = sc.nextDouble();
        System.out.println("   Profile   ");
        System.out.println("   ~~~~~~~   ");
        System.out.println("Name: "+ name);
        System.out.println("Cards: "+ age);
        System.out.println("Happy?: "+ happy);
        System.out.println("Change: "+ change);
    }
}


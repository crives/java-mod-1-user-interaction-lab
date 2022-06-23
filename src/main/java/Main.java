import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean repeat = true;
        Scanner inputScanner = new Scanner(System.in);
        while(repeat) {
            System.out.println("Please enter your age (int):");
            try {
                int userAge = inputScanner.nextInt();
                if (userAge < 18 && userAge >= 10) {
                    System.out.println("Hello! You are not yet of legal age at the age of " + userAge + "!");
                    repeat = false;
                } else if (userAge >= 18) {
                    System.out.println("Hello! You are of legal age at the age of " + userAge + "!");
                    repeat = false;
                } else if (userAge < 10) {
                    System.out.println("Hello! Wow, you are getting so big!");
                    repeat = false;
                }
            } catch (Exception e) {
                String str = inputScanner.nextLine();
                System.out.println("Please enter a valid age (int)!");
                repeat = true;
            }
        }
    }
}

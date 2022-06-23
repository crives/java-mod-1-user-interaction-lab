import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your age (int):");
        try(Scanner inputScanner = new Scanner(System.in)) {
            int userAge = inputScanner.nextInt();

            if (userAge < 18 && userAge >= 10) {
                System.out.println("Hello! You are not yet of legal age at the age of " + userAge + " !");
            } else if (userAge >= 18) {
                System.out.println("Hello! You are of legal age at the age of " + userAge + " !");
            } else if (userAge < 10) {
                System.out.println("Hello! Wow, you are getting so big!");
            }        
        } catch (Exception e) {
            System.out.println("Please enter an integer value!");
        }
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner inputScanner = new Scanner(System.in);) {
            while(true) {
                System.out.println("Please enter your age (int):");
                int userAge = inputScanner.nextInt();
        
                if (userAge < 18 && userAge >= 10) {
                    System.out.println("Hello! You are not yet of legal age at the age of " + userAge + "!");
                } else if (userAge >= 18) {
                    System.out.println("Hello! You are of legal age at the age of " + userAge + "!");
                } else if (userAge < 10) {
                    System.out.println("Hello! Wow, you are getting so big!");
                }              
            }
        }  catch (Exception e) {
            System.out.println("Please enter a valid age (int)!");
        }
    }
}


import java.util.Locale;
import java.util.Scanner;

public class AboutYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("What's your first name?");
        String firstName = scanner.next();

        System.out.println("What's your last name?");
        String lastName = scanner.next();
        
        System.out.println("What's your height?");
        double height = scanner.nextDouble();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println();
        System.out.println("Hello, " + firstName + " " + lastName + ". Nice to meet you!");
        System.out.println("You are " + age + " years old and " + height + " tall.");

        scanner.close();
    }
}

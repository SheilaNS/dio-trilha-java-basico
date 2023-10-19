public class AboutMe {
    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];
        String age = args[2];
        String height = args[3];

        System.out.println("Hello, my name is " + firstName + " " + lastName + ".");
        System.out.println("I am " + age + " years old and " + height + " tall.");
    }
}

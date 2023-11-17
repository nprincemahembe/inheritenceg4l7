import java.util.Scanner;

public class person {
    protected String surname;
    protected String firstName;
    protected String street;
    protected String zipCode;
    protected String city;

    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter  surname: ");
        this.surname = scanner.nextLine();
        System.out.println("Enter street: ");
        this.street = scanner.nextLine();
        System.out.println("Enter zip code: ");
        this.zipCode = scanner.nextLine();
        System.out.println("Enter city: ");
        this.city = scanner.nextLine();
    }

    public void print() {
        System.out.println("first name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("street: " + street);
        System.out.println("zip code: " + zipCode);
        System.out.println("city: " + city);
    }
}

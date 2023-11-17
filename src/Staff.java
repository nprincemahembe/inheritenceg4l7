import java.util.Scanner;

public class Staff extends person{
    private String education;
    private String position;

    public void initialize1() {
        initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter education: ");
        this.education = scanner.nextLine();
        System.out.println("Enter position: ");
        this.position = scanner.nextLine();

    }

    public void print1(){
        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}

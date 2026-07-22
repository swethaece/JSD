import java.util.Scanner;

public class MarrigeEligibility {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your gender:(Male/Female)");
        String gen=scan.next();
        System.out.println("Enter your age:");
        int age=scan.nextInt();
        if ((gen.equalsIgnoreCase("Male")&&age>=18)||
        (gen.equalsIgnoreCase("Female")&&age>=21)) {
            System.out.println("You are eligible for marriage");
        }
        else{
            System.out.println("You are not eligible for marriage");
        }
    scan.close();
    }
}

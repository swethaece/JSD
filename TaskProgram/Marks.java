import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 Marks:");
        int mark1 = scan.nextInt();
        int mark2 = scan.nextInt();
        int mark3 = scan.nextInt();
        int mark4 = scan.nextInt();
        int mark5 = scan.nextInt();
        int tot = mark1 + mark2 + mark3 + mark4 + mark5;
        float avg = tot/5.0f;
        System.out.println("This is your total marks: " + tot);
        System.out.println("this is your percentage: " + avg );
        scan.close();

    }
}

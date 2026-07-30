import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Year");
        int year=scan.nextInt();
        System.out.println("Enter Month");
        int month=scan.nextInt();
        int days =0; 
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31; 
                System.out.println("This month have 31 days");
                break;
            case 4: case 6: case 9: case 11: 
                days = 30;
                System.out.println("This month have 30 days");
                break;
            case 2:
                if ((year %4==0 && year %100 !=0) || (year %400==0)) {
                    days =29;
                    System.out.println("This month have only 29 days and leap year");
                }
                else{
                    days = 28;
                    System.out.println("This month have only 28 days");
                    
                }
                break;
            default:
                System.out.println("Invalid month ! Please enter number between 1 to 12.");
                break;
        }
        scan.close();
    }
}

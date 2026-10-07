import java.util.Scanner;
public class TwoArrayDemo2 {
     public static void main(String[] argss){
        //int arr[][]={{11,22,33},{44,55,66},{77,88,99}};
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter row and col size");
        int r=scan.nextInt();
        int c=scan.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter matrix values:"+r+"X"+c);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=scan.nextInt();
            }
            System.out.println();
        }
        System.out.println("Result Array:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("    "+arr[i][j]);
            }
            System.out.println();
        }
        scan.close();
    }
}

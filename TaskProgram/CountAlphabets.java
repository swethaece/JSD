/*
//question:
1)count alphabets numbers and special chars
Enter text:
	karur.123.swetha@gmail.com
output:
	alphapets:12
	numbers : 3
	special char :2

note :
	while checking char @ implement break
 */
import java.util.Scanner;

public class CountAlphabets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Gmail");
        String text = scan.next();
        int alphcnt=0;
        int numcnt=0;
        int dotcnt=0;
        int length = text.length();
        for(int i=0;i<length;i++)
        {
            char c = text.charAt(i);
            if(c>='a' && c<='z' )
                alphcnt++;
            if(c>='0' && c<='9' )
                numcnt++;
            if(c=='.')
                dotcnt++;
            if(c=='@')
                break;
        }
        System.out.println("Alphabets count is:" + alphcnt);
        System.out.println("Numbers count is:" + numcnt);
        System.out.println("Dot count is:" + dotcnt);
        scan.close();
    }
}

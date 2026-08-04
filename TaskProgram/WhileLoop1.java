import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n Value");
        long n=scan.nextLong();
        long evendis=0,odddis=0,evencnt=0,oddcnt=0,evensum=0,oddsum=0;
        long te=1,to=1;
        while(n!=0)   
        {
            long rem=n%10;
            if(rem%2==0){
            evensum=evensum+rem;   
            evencnt++;
            //evendis=evendis*10+rem; 
            evendis=evendis+rem*te;   //0+4*1      4+2*10=24
            te=te*10;                 //1*10       10*10
            }
            else{
                oddsum=oddsum+rem;
                oddcnt++;
               // odddis=odddis*10+rem;
                odddis=odddis+rem*to;
                to=to*10;
            }
            n=n/10;
        }
        System.out.println("Display even number"+evendis);
        System.out.println("Display odd number"+odddis);
        System.out.println("sum of even count:"+evencnt);
        System.out.println("sum of odd count:"+oddcnt);
        System.out.println("sum of even numbers:"+evensum);
        System.out.println("sum of odd numbers:"+oddsum);
        scan.close();
    }
}

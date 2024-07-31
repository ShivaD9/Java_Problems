package Java_Problems;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();


        // Logic-1 (Using Algorithm)
        // int rev = 0 ;
        // while (num!=0) {
        //     rev=rev*10 + num % 10 ;  // rev=0*10 + 1234 %10 =4
        //     num=num/10;  // 1234/10=123
        // }
        // System.out.println("Reverse Number " +rev);


        // Logic-2 (Using StringBuffer class)
        // StringBuffer rev;
        // StringBuffer sb = new StringBuffer(String.valueOf(num));
        // rev = sb.reverse();
        // System.out.println("Reverse Number " +rev);


        // Logic-3 (StringBuilder class)
        // StringBuilder sbl = new StringBuilder();
        // sbl.append(num);
        // StringBuilder rev= sbl.reverse();
        // System.out.println("Reverse Number " +rev);

    }
}

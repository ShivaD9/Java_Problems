package Java_Problems;

public class SumOfDigits {
    public static void main(String[] args) {
        
        int num =1234;
        int sum =0;

        while (num > 0) {
            sum = sum + num % 10 ; // will give the "reminder"
            num = num /10 ;  // will give the  "quotient"
        }

        System.out.println("Sum of the Digits in a number\t" +sum);

    }
}

package Java_Problems;

public class CountNumOfEvenOddDigits {
    public static void main(String[] args) {
        int num =123456;

        int count_Even = 0;
        int count_Odd = 0;

        while (num > 0) {  //1234 123 12 1
            int rem = num % 10; // 4 3 2 1

            if (rem%2 == 0) {
                count_Even++; // 1 2 3
            }
            else{
                count_Odd++;  // 1 2 3
            }

            num = num /10; //123 12 1 
        }

        System.out.println("Number of Even Digits \t" +count_Even);
        System.out.println("Number of Odd Digits \t" +count_Odd);
    }
}

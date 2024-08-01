package Java_Problems;

import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Enter Thrid Number");
        int c = sc.nextInt();

        // Logic-1
        // if(a>b && a>c){
        //     System.out.println(a+ "\t Is the Largest Number ");
        // }
        // else if (b>a && b>c) {
        //     System.out.println(b+ "\t Is the Largest Number "); 
        // }
        // else{
        //     System.out.println(c+ "\t Is the Largest Number "); 
        // }


        // Logic-2 (Teranary Operator)
        // int Largest1= a>b?a:b;  // Largest of a and b;
        // int Largest2=c>Largest1?c:Largest1;  // Largest of largerst1 and c
        // System.out.println(Largest2+ "\t is Largerst Number");


        // Logic-3 (Single Sentence)
        // int Largest = c>(a>b?a:b)?c:(a>b?a:b);
        // System.out.println(Largest+ " \t Is the Largest Number");
    }
}

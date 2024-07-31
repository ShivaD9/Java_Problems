package Java_Problems;
class Swaping2Num{
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        System.out.println("Before Swaping " +a +" "+b);

        // Logic-1
        // int x=a;
        // a=b;
        // b=x;
        // System.out.println("After Swaping " +a +" "+b); 


        // Logic-2 (Using "+" & "-" and Without using 3rd Variable )
        // a=a+b;  //10+20=30
        // b=a-b;  //30-20=10
        // a=a-b;  //30-10=20
        // System.out.println("After Swaping " +a +" "+b);


        // Logic-3 (Using "/" & "*" and Without using 3rd Variable and here "a" & "b" value should not be Zero)
        // a=a*b;  //10*20=200
        // b=a/b;  //200/20=10
        // a=a/b;  //200/10=20
        // System.out.println("After Swaping " +a +" "+b);


        // Logic-4 (bitwise XOR "^")
        // a=a^b;  // 10^20=30
        // b=a^b;  // 30^20=10
        // a=a^b;  // 30^10=20
        // System.out.println("After Swaping " +a +" "+b);


        // Logic-5 (SingleStatement)
        // b=a+b-(a=b); //equation go from left to right 
                        // Step-1 :: (b=a) <a=20>
                        // Step-2 :: a+b <10+20=30>
                        // Step-3 :: a+b-(a=b) <30-20=10>
        // System.out.println("After Swaping " +a +" "+b);



    }
}
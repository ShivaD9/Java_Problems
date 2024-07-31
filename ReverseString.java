package Java_Problems;

public class ReverseString {

    public static void main(String[] args) {

        String str = "ABCD";
        String rev = "";
    
        // // Logic-1 (Concatenation)
        // int len = str.length(); // 4
        // for(int i =len-1 ; i >= 0; i--){ //3 2 1 0
        //     rev = rev + str.charAt(i);  // D C B A
        // }
        // System.out.println("Reverse String "+ rev);


        // // Logic-2 (Using Character Array)
        // char a[]=str.toCharArray();
        // int len=a.length;  // 4
        // for(int i=len-1;i>=0;i--){  //3 2 1 0
        //     rev =rev + a[i];   // D C B A
        // }        
        // // System.out.println("Reverse String "+ rev);


        // Logic-3 (Using StringBuffer class)
        // StringBuffer sb = new StringBuffer(str);
        // System.out.println(sb.reverse());
        // System.out.println("Reverse String "+ rev);
    }

}

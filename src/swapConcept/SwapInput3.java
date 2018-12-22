package swapConcept;

public class SwapInput3 {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
//without using temp variable * operator
        a = a*b; //20000
        b= a/b;  //100
        a = a/b;  //200
        System.out.println(a);
        System.out.println(b);


    }
}

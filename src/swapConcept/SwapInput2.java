package swapConcept;

public class SwapInput2 {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
//without using temp variable + operator
        a = a +b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);

    }
}

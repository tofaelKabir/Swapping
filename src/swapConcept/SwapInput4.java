package swapConcept;

public class SwapInput4 {
    public static void main(String[] args) {


        int a = 10; //0101 assume
        int b = 20; //1010

//using ^ xor operator
        a = a^b; //1111
        b = a^b;  //0101
        a = a^b; //1010
        System.out.println(a);
        System.out.println(b);


    }
}
//multiple way, arithmetical way or xor way
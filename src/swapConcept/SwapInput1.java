package swapConcept;

public class SwapInput1 {
    public static void main(String[] args) {


        int x = 100;
        int y = 200;

        int temp;
        temp = x;
        x=y;
        y = temp;

        System.out.println(x);
        System.out.println(y);
        System.out.println(temp);

    }
}

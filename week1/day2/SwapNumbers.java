public class SwapNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Using Temporary Variable");

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();

        int x = 10;
        int y = 20;

        System.out.println("Without Temporary Variable");

        System.out.println("Before swap:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swap:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
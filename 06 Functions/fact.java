import java.util.Scanner;

public class fact {

    public static int factoial(int a) {

        int fact = 1;

        for (int i = a; i >= 1; i--) {
            fact = fact * i;
        }

        return fact;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("factorial of %d is : %d", n, factoial(n));
    }
}

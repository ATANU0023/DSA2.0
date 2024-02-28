import java.util.Scanner;

public class IfElseTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();

        if (age<18) {
            System.out.println("Not adult , Not approved for the game");
        }else{
            System.out.println("Adult, approved for the game");
        }
    }
}

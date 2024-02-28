import java.util.Scanner;

public class SwithchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente between 1 to 6");
        int input = sc.nextInt();


        switch (input) {
            case 1:
                System.out.println("hello");
                break;
            
            case 2:
                System.out.println("hola");
                break;
                
            case 3:
                System.out.println("chai or code");
                break;
            
            case 4:
                System.out.println("bonjour");
                break;
                
            case 5:
                System.out.println("nameste");
                break;
            
            case 6:
                System.out.println("hi");
                break;
            default:
                break;
        }
    }
}

import java.util.Scanner;
class addd{
    int a, b;
   public void sum(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a value:");
     a = sc.nextInt();
     System.out.println("enter b value: ");
     b = sc.nextInt();
     int summ = a+b;
     System.out.println("sum"+" "+summ);
   }
   

}
public class UserInput {
    public static void main(String[] args) {
        System.out.println("enter fullname"); 
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        addd ad = new addd();
        ad.sum();
    }
}

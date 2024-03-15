import java.util.Scanner;

public class mulFun {
    public static int mul(int a, int b){
        int multiple = a*b;
        return multiple;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a :");
        int a = sc.nextInt();
        System.out.println("enter value of b :");
        int b = sc.nextInt();
        System.out.println("output:"+mul(a,b));;
    }
}

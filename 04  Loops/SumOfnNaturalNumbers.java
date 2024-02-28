import java.util.Scanner;

public class SumOfnNaturalNumbers {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any range of number to  get the sum of the numbers:");
        int n = sc.nextInt();
        for(int i =1 ;i<=n;i++){
            sum = sum+i;
        }
        System.out.print("sum :"+sum);
    }
}

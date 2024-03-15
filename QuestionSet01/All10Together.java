import java.util.Scanner;
// 1. enter 3 numbers from the user & make a function to print their average.
/* 
public class All10Together {
   
        public static int  average(int a,int b,int c){
            return (a+b+c) / 3;

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("the average of the numbers is :"+ average(a,b,c));
    }    
}
*/

// 2. waf to print the sum of all add numbers form 1 to n
/* 
public class All10Together {

    public static int oddSum(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 1) {
                count +=i;
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range: ");
        int a = sc.nextInt();
        System.out.println("the sum of the odd numbers is :" + oddSum(a));
    }
}
*/

// 3. waf which takes 2 numbers and returns the greater of those two
/* 
class All10Together {

    public static void greaterNum(int a, int b) {
        if (a > b) {
            System.out.println(a + "is greater");
        } else {
            System.out.println(b + "is greater");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        greaterNum(m, n);
    }

}
*/

// 4. waf that takes in the radius as input and returns the circumference of a circle

/* 
public class All10Together {
    public static float circumference(float r){
        float c = 2*(22/7)*r;
        return c;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float radius = sc.nextFloat();
    System.out.println("the circumference of the circle which radius is "+" "+radius+" "+"is"+" "+circumference(radius));
}
    
}
*/

// 5. waf that takes in age as input and returns if that person is eligible to vote or not

/* 
class All10Together {

    public static void eligibleForVote(int age){
        if (age>=18) {
            System.out.println("eligible for vote");
        }
        else{
            System.out.println("not eligible for vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        eligibleForVote(age);
    }
    
}
*/

// 6. write a infinite loop using do while condition

/* 
class All10Together {
    public static void main(String[] args) {
        do {
            System.out.println("infinite");
            //break;
        } while (true);
    }
    
}
*/

// 7. wap to enter the numbers till the user wants and at the end it should display the count of positive , negative, and zeros entered. 

/* 
class All10Together {
    public static void detect(int a[],int n){
        int neCount =0, poCount=0, zeroCount=0 ;
        for (int i =0;i<n;i++){
            if(a[i]<0){
                neCount++;
            }
            else if(a[i]==0){
                zeroCount++;
            }
            else{
                poCount++;
            }
        }
        System.out.println("positive:"+poCount);
        System.out.println("negative:"+neCount);
        System.out.println("zero:"+zeroCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the number of input:");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("enter the numbers: ");
        for(int i =0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        detect(ar, n);
    }
    
}
*/

// 9. write a function that calculates the gretest common divisor of 2 numbers

/* 
class All10Together {
    public static int gcd(int a , int b){
        if(a%b==0){
            return b;
        }
        else{
            return gcd(b, (a%b));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD:"+" "+gcd(a, b));

    }
    
}
*/

// 10. write a program to print Fibonacci series of n terms,
// where n is input by user: 0 1 1 2 3 5 8 11 13 21 ...... 
//in the fibonacci series , a number is the sum of the previous 2 numbers that come before it.


class All10Together {
    public static void fibonacci(int n){
        int left=0, right=1, next=0;
        System.out.print(left+" "+ right);
        for(int i=0;i<n;i++){
            next = left+right;
            System.out.print(" "+next);
            left =right;
            right=next;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("the series is ");
        fibonacci(n);
    }
    
}
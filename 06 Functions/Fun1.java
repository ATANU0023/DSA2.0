// returnType functionName(type arg1,arg2,...){
//     operations
// }

// import java.util.Scanner;

// public class Fun1 {
   
  

//     public void printMe(String name){
//         System.out.println("your name is "+ name);
//         return;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Fun1 f = new Fun1();
//         f.printMe("atanu");
//     }
// }

/*  */

import java.util.*;

public class Fun1 {
    public static int sum2No(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum2No(a,b);
        System.out.println("the ouput is "+ sum);

    }
}
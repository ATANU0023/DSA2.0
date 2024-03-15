// public class NumberPyramid {
//     public static void main(String[] args) {
//         int i,j;
//         for(i=0;i<=5;i++){
//             for(j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// public class NumberPyramid{
//     public static void main(String[] args) {
//         for(int i =5;i>=1;i--){
//             for(int j =1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// public class NumberPyramid {

//     public static void main(String[] args) {
//         int num=1;
//         for(int i = 1 ;i<=5;i++){
//             for (int j =1;j<=i;j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

public class NumberPyramid {

    public static void main(String[] args) {
        int i ,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
};
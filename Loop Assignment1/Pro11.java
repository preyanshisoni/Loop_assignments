// //WAP to calculate the sum of given series 1 - 2 + 3 - 4 + 5 - 6................n terms

// import java.util.Scanner;

// public class P11 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a Number");
//         int n = sc.nextInt();
//         if (n % 2 == 1) {
//             System.out.println("Sum " + (n + 1) / 2);
//         } else {
//             System.out.println("Sum " + (-n / 2));
//         }

//     }
// }


import java.util.Scanner;
class Pro11{
    public static void main(String[] args) {
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
           if(i%2==0){
            sum=sum-i;
           }
           else{
             sum=sum+i;
           }
        }
        System.out.println(sum);
    }
}

// import java.util.Scanner;

// public class P15 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rev = 0;
//         System.out.println("Enter a Number ");
//         int n = sc.nextInt();
//         int temp = n;
//         while (temp != 0) {
//             int r = temp % 10;
//             rev = rev + r * r * r;
//             temp = temp / 10;
//         }
//         if (n == rev) {
//             System.out.println("Number is Armstron " + rev);
//         } else {
//             System.out.println("Not a Armstrom " + rev);
//         }
//     }
// }
import java.util.Scanner;

public class Pro15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,a=0;
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int temp=n;
        while(temp!=0){
            r=temp%10;
            int cube=r*r*r;
            a= a +cube;
            temp=temp/10;
         }
         if(n==a){
            System.out.println(n +" is a armstron number ");
         }
         else{
            System.out.println(n +" is not a armstron number ");
         }

    }
}
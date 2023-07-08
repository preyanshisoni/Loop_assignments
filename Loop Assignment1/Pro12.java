// import java.util.Scanner;

// public class P12 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a Number ");
//         int n = sc.nextInt();
//         int fact = 1;
//         for (int i = n; i > 0; i--) {
//             fact = fact * i;
//         }
//         System.out.println(fact);
//     }
// }
import java.util.Scanner;
class Pro12{
public static void main(String[] args) {
    int fact=1;
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    while(n!=0){
        fact= fact*n;
        n--;
    }
    System.out.println(fact);

}
}

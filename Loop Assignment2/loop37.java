import java.util.Scanner;
public class loop37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int rev = 0;
        int temp=n;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
          System.out.println("Reverse number is: "+rev);
        if(rev==temp){
            System.out.println("The number is a palindrome number");
        }
        else{
            System.out.println("The number is not a palindrome number");
        }
    }
}



import java.util.Scanner;

public class Pro14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        int temp;
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        temp=n;
        while (temp != 0) {
            int r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;
        }
        if(n==rev){
            System.out.println(rev+ " is a palindrome number ");
        }
        else{
            System.out.println(rev + " is not a palindrome number ");
        }
    }
}

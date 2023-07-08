// WAP to find out all the palindrome numbers between two entered numbers
import java.util.Scanner;
class loop50 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int f=sc.nextInt();
    System.out.println("Enter last number");
    int l=sc.nextInt();
    System.out.println("Palindrome Numbers between "+f+" and "+l+" are ");
    for(int i=f;i<=l;i++){  
        int rev = 0;
        int temp=i;
        int n=temp;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if(rev==temp){
            System.out.println(temp+" number is a palindrome number");
        }
      
    }  
    
    }
}

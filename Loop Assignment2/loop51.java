import java.util.Scanner;

public class loop51 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int f=sc.nextInt();
    System.out.println("Enter the last number");
    int l=sc.nextInt();
    for(int k=f;k<=l;k++){
          int n=k;
          int rev=0;
          while (n!=0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
         System.out.print(rev+" ");
    }
    

        
      
    }
}

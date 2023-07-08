import java.util.Scanner;

public class loop56 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int f=sc.nextInt();
    System.out.println("Enter last number");
    int l=sc.nextInt();
    int fact=1;
    System.out.println("Factorial of numbers between "+ f+" and "+l+" are");
    System.out.println();
    for(int k=f;k<=l;k++){
         fact=1;
         for(int i=1;i<=k;i++){
            fact=fact*i;
         }
         System.out.println("Factorial of "+k+" is "+fact);
    }    
    }
}

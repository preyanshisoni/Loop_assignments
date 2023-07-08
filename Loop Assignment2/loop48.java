//WAP to find out the factors of all the numbers between two entered numbers

import java.util.Scanner;

public class loop48 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int f=sc.nextInt();
    System.out.println("Enter last number");
    int l=sc.nextInt();
    System.out.println("The factors of number between "+f+" and "+l+" are ");
    for(int k=f;k<=l;k++){
       int n=k;
       for(int i=1;i<=n;i++){
       if(n%i==0){
         System.out.println("The factor of "+n+" is "+i);
        
       }
    } 
      System.out.println();
    }
       
    }
}

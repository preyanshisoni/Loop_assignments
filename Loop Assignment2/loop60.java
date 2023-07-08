// WAP to print Square, Cube and Square Root of all numbers from 1 to N
import java.util.Scanner;
public class loop60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int square=i*i;
            int cube=i*i*i;
            System.out.println();
            System.out.println("Square of "+i+" is "+square);
            System.out.println("Cube of "+i+" is "+cube);
        }
         System.out.println();
         for(int i=1;i<=n;i++){
            int squareroot=0;
            squareroot=i*i;
            if(n==squareroot){
                 System.out.println("Square Root of "+n+" is "+i);
            }
        }
        

        
    }
}

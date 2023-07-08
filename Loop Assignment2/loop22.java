import java.util.Scanner;

public class loop22 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
         int cube=i*i*i;
         System.out.print(cube+" ");
    }  
    }
}

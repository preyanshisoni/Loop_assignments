import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int fact=1;
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    for(int i=n;i>=1;i--){
        fact=fact*i;
    } 
    System.out.println(fact); 
    }
}

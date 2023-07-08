import java.util.Scanner;

public class loop31 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    int k=9;
    for(int i=1;i<=n;i++){
        System.out.print(k+" ");
        k=k*10+9;
    }     
    }
}

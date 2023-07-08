
import java.util.Scanner;
public class loop16 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    System.out.println("Enter the value of m");
    int m=sc.nextInt();
    System.out.println();
    for(int i=m;i<=n;i++){
        if(i%3==0){
            System.out.println(i);
        }
    }
    }
}

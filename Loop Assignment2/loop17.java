import java.util.Scanner;

public class loop17 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt(); 
    int num=1;
    System.out.println(); 
    for(int i=1;i<=n;i++){
         System.out.println(num);
         num=num+i;
        } 
    }
}

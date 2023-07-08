import java.util.Scanner;

public class loop18 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt(); 
    int pro=1;
    int b=2;
    int a=1;
    System.out.println(a);
    System.out.println(b);
    for(int i=0;i<=n;i++){
       pro=a*b;
       System.out.println(pro);
       a=b;
       b=pro;
 }
    }
}

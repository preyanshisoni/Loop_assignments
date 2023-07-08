import java.util.Scanner;

public class loop8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt(); 
    int sum=0;
    int b=1;
    int a=0;
    System.out.println(a);
    System.out.println(b);
    for(int i=0;i<=n;i++){
       sum=a+b;
       System.out.println(sum);
       a=b;
       b=sum;
 }
    }
}

import java.util.Scanner;

public class loop19 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    float sum=0; 
    for(int i=1;i<=n;i++){
        float num= 1f/i;
        sum=sum+num;
      }
      System.out.println(sum);
    }
}

import java.util.Scanner;

public class loop34 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n/2;i++){
         while(n%i==0){
             sum=sum+i;
             i++;
         }
    }
    if(n==sum){
        System.out.println("Perfect Number");
    }
    else{
        System.out.println("Not a Perfect Number");
    }
    }
}

import java.util.Scanner;

public class Pro10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int sum = 0;
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        
        for(int i=2;i<=n;i+=2){
            sum = sum + (2*i);
        }
        System.out.println("sum "+sum);
           
    }
}
import java.util.Scanner;
class Pro25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pow=1;
        System.out.println("Enter the valur of x");
        int x=sc.nextInt();
        System.out.println("Enter the valur of n");
        int n=sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++){
            pow=pow*x;
            float a=1.0f/pow;
            sum = sum + a;
        }
         System.out.println(sum);
    }
       
        
 }

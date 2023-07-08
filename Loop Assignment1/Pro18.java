import java.util.Scanner;
class Pro18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pow=1;
        System.out.println("Enter the valur of x");
        int x=sc.nextInt();
        System.out.println("Enter the value of y");
        int y=sc.nextInt();
        int n;
        int sum=0;
        for(int i=1;i<=y;i++){
            pow=pow*x;
            sum = sum+pow;
        }
         System.out.println(sum);
    }
       
        
    }


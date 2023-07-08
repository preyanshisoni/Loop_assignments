import java.util.Scanner;
class Pro17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pow=1;
        System.out.println("Enter the valur of x");
        int x=sc.nextInt();
        System.out.println("Enter the value of y");
        int y=sc.nextInt();
        int n;
        for(int i=1;i<=y;i++){
            pow=pow*x;
        }
         System.out.println(pow);
    }
       
        
    }


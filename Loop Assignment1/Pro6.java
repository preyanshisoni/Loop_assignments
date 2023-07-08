import java.util.Scanner;
class Pro6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i,n;
        System.out.println("Enter the no of terms to be entered");
         n = obj.nextInt();
         for(i=2;i<=n;i+=2)
         {
            System.out.println(i);
         }
    }
}

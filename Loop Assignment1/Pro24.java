import java.util.Scanner;
class Pro24 {
    public static void main(String[] args) {
        float sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms ");
        int n = sc.nextInt();
        for(float i=1;i<=n;i++){
            sum=(sum+(1f/i));
        }
        System.out.println(sum);
    }
}

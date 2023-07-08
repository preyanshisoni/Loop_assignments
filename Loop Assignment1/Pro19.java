import java.util.Scanner;
class Pro19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fact=1;
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            float a=i/fact;
            sum=sum+a;
        }
        System.out.println(sum); 
    }
}

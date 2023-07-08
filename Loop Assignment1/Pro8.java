import java.util.Scanner;
class Pro8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i,n,a=0,b=1,c;
        System.out.println("Enter the no of terms to be entered");
        n = obj.nextInt();
        System.out.println(a);
        System.out.println(b);
        while(n!=0)
        {
        c=a+b;
        a=b;
        b=c;
        System.out.println(c);
        n--;
        }
    }
}

import java.util.Scanner;

public class loop13 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    System.out.println();
    for(int i=n;i>=1;i--){
        System.out.println(i);
    }
    }
}

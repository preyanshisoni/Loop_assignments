import java.util.Scanner;

public class loop11 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    System.out.println();
    for(int i=1;i<=n;i++){
        if(i%2!=0){
            System.out.println(i);
        }
    }
    }
}

import java.util.Scanner;

public class loop55 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int f=sc.nextInt();
    System.out.println("Enter last number");
    int l=sc.nextInt();
    System.out.println("Odd numbers are");  
    for(int i=f;i<=l;i++){
        if(i%2!=0){
            System.out.println(i);
        }
    } 
    }
}

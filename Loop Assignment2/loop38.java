import java.util.Scanner;

public class loop38 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    int temp=n;
    int r,a=0;
    for(int i=0;i<3;i++){
       r=n%10;
       int cube=r*r*r;
       a=a+cube;
       n=n/10;
    }
    if(a==temp){
        System.out.println("The given number is a Armstrong number ");
    }
    else{
        System.out.println("The given number is not a Armstrong number ");
    }
    }
}

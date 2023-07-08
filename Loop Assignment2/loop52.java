import java.util.Scanner;

public class loop52 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int f=sc.nextInt();
    System.out.println("Enter last number");
    int l=sc.nextInt();
    for(int k=f;k<l;k++){
    int n=k;
    int temp=n;
    int r,a=0;
    while(n!=0){
       r=n%10;
       int cube=r*r*r;
       a=a+cube;
       n=n/10;
    }
    if(a==temp){
        System.out.println("Number is a Armstrong number "+temp);
    }
 
    }
    }
}


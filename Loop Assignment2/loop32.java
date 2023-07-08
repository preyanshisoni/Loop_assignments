import java.util.Scanner;

public class loop32 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt(); 
    int k=65;  
    int p=98;
    for(int i=0;i<=n;i++){
        if(i%2==0){
            System.out.println((char)k);
            k=k+2;
        }
        else{
            System.out.println((char)p);
            p=p+2;
        }
    }
    }
}

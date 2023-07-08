import java.util.Scanner;

public class loop49 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int f=sc.nextInt();
    System.out.println("Enter the last number");
    int l=sc.nextInt();   
    for(int k=f;k<=l;k++){ 
    int sum=0;
    int n=k;
        for(int i=1;i<=n/2;i++){
             while(n%i==0){
                 sum=sum+i;
                 i++;
             }
        }
        if(n==sum){
            System.out.println("Perfect Number is "+sum);
        }
       
    }  
    }
}

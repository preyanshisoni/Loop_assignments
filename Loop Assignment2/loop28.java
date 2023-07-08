import java.util.Scanner;

public class loop28 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();  
    for(int i=1;i<=n;i++){

        if(i%5==0){
            System.out.print("Hello ");
        }
        else{
            System.out.print(i+" ");
        }
      
    } 
    }
}

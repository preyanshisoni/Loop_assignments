import java.util.Scanner;

public class loop40 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt(); 
    int even=0; 
    int odd=0;
    while(n!=0){
        int r=n%10;
        n=n/10;
        if(r%2==0){
            even++;
        }
        else{
            odd++;
        }
    } 
    System.out.println("Even digits are "+even);
    System.out.println("Even digits are "+odd);
    }
}

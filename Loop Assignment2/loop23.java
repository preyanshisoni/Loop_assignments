import java.util.Scanner;

public class loop23 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();  
    for(int i=1;i<=n*2;i++){
        if(i%2!=0){
            int square=i*i;
            System.out.println(square);
        }
    }
    }
}

import java.util.Scanner;

public class Pro20 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        for(int k=100;k<=199;k++){ 
        int n=k;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is prime");
        }
        }
    
    }
}

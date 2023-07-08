import java.util.Scanner;

public class loop39 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    int temp=n;
    int r;
    int sum=0;
    while(n>0){
        r=n%10;
        n=n/10;
        
          int fact=1;
        for(int i=1;i<=r;i++){
           fact=fact*i;
         }
         sum=sum+fact;     
    }
     System.out.println(sum); 
    if(sum==temp){
        System.out.println("Number is strong "+temp);
    }
    else{
        System.out.println("Number is not strong");
    }
}
}



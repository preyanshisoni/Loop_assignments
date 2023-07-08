import java.util.Scanner;

class loop26 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt(); 
    for(int i=0;i<=n;i++){
         if(i%2==0){
             int cube=i*i*i;
             System.out.println(cube);
         }
    }
    
   }   
}

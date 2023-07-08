import java.util.Scanner;
class Pro9 {
        public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number to be inserted");
        int n =obj.nextInt();
        for(int i=1;i<=n;i++)
        {
              sum = sum+i;
            
        }
          System.out.println(sum);
}
}
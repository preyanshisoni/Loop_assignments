import java.util.Scanner;
class Pro7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i=1,n;
        System.out.println("Enter the no of terms to be entered");
         n = obj.nextInt();
         while(n!=0){
            System.out.println(i*i);
            i++;
            n--;
         }
    }
}

import java.util.Scanner;
public class loop4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    for(int i=1;i<=10;i++){
        int table=n*i;
        System.out.println(n+"*"+i+"="+table);
    }

    }
}

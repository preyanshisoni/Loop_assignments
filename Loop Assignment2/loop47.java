import java.util.Scanner;

public class loop47 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int l=sc.nextInt();
    System.out.println("Enter the last number");
    int f=sc.nextInt();
    for(int k=l;k<f;k++)
    {
        for(int i=1;i<=10;i++)
        {
             int table=k*i;
             System.out.println(k+"*"+i+"="+table);
        }
        System.out.println();
    }

    }
}

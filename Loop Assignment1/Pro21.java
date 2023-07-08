import java.util.Scanner;

class Pro21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev;
        for (int i= 101; i <= 199; i++) {
            int n=i;
            rev=0;
            for (int temp = 1; temp <= 3; temp++)
            {
                int rem = n % 10;
                rev = rev * 10 + rem;
                n = n/ 10;
           }
            System.out.println(rev);
        }

    }
}

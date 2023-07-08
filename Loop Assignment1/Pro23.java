import java.util.Scanner;

class Pro23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 101; i <= 199; i++) {
            int n = i;
            int a = 0, r;
            for (int temp = 1; temp <= 3; temp++) {
                r = n % 10;
                int cube = r * r * r;
                a = a + cube;
                n = n / 10;
            }
            if (i == a) {
                System.out.println(i + " is a armstron number ");
            }

        }
    }
}



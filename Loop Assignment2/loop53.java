// import java.util.Scanner;

// public class loop53 {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter First number");
//     int m = sc.nextInt();
//     System.out.println("Enter second number");
//     int n=sc.nextInt();
//     int r;
//     int fact=1;
//    int sum=0;
//     int temp=0;
//     for(int i=m;i<n;i++) {
//         temp=i;
//         sum=0;
//         while(m!=0){
//             r=m%10;
//             m=m/10;
//             for(int j=1;j<r;j++){
//                 fact=fact*j;
//             }
//             sum=sum+fact;
//         }
//      if(sum==temp){
//             System.out.println("Number is strong "+sum);
//         }
//   }
//     temp++;
//     m=m+temp;
// }
// }

import java.util.Scanner;

public class loop53 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int f=sc.nextInt();
    System.out.println("Enter last number");
    int l=sc.nextInt();
    System.out.println("The strong numbers between "+f+" and "+l+" are");
    for(int k=f;k<=l;k++){
    int n=k;
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
    if(sum==temp){
        System.out.println(temp);
    }
   
}
}
}



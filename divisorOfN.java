import java.util.Scanner;
class divisorOfN {
    public static int divisor(int num , int n){
        if(n>num){
            return 0;
        }
        if(num%n == 0){
            System.out.print(n+" ");
            return divisor(num, n+1);
        } else{
            return divisor(num, n+1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scan.nextInt();
        divisor(n, 1);
    }
}
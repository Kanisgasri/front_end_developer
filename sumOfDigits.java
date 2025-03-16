import java.util.Scanner;
class sumOfDigits {
    public static int sumDigit( int n){
        if(n%10==n){
            return n;
        } else{
            int sum = n%10;
            return sum + sumDigit(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = scan.nextInt();
        System.out.print(sumDigit(n));
    }
}
import java.util.Scanner;
class countDigits {
    public static int countDigit( int n){
        if(n%10==n){
            return 1;
        } else{
            return 1+ countDigit(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = scan.nextInt();
        System.out.print(countDigit(n));
    }
}

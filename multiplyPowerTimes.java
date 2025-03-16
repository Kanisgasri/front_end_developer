import java.util.Scanner;
class multiplyPowerTimes {
    public static int multiply(int n , int times){
        if(times==0){
            return 1;
        } else{
            return n * multiply(n, times-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scan.nextInt();
        System.out.print("enter power: ");
        int power = scan.nextInt();
        System.out.print(multiply(n, power));
    }
}
import java.util.Scanner;
class countDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = scan.nextInt();
        int count = 0;
        while(n>0){
            int last = n%10;
            count++;
            n = n/10;
            if(n==0){
                System.out.println(count);
            }
        }
    }
}
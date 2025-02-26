import java.util.Scanner;
class starDownward {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n:");
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n+1)-i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
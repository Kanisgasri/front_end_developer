import java.util.Scanner;
class starTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*(n-i)+1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
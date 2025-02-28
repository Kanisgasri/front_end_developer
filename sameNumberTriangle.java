import java.util.Scanner;
class sameNumberTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scan.nextInt();
        int k =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k+" ");
            }
            k++;
            System.out.println("");
        }
    }
}
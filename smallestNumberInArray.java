import java.util.Scanner;
class smallestNumberInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scan.nextInt();
        int small;
        System.out.print("enter numbers: ");
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
        }
        small = a[0];
        for(int j=1; j<n; j++){
            if(small > a[j]){
                small = a[j];
            }
        }
        System.out.println(small);
    }
}
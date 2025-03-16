import java.util.Scanner;
class sumPrimeSieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter numbers: ");
        int L = scan.nextInt();
        int R = scan.nextInt();
        int sum = 0;
        int [] arr = new int[R+1];
        for(int c=2; c<=R; c++){
            arr[c] = 0;
        }
        for(int i=2; i<=Math.sqrt(R); i++){
            if(arr[i]==0){
                for(int j=i*2; j<=R; j=j+i){
                    arr[j]=1;
                }
            }
        }
        for(int k=L; k<=R; k++){
            if(arr[k]==0){
                sum = sum + k;
            }
        }
        System.out.println(sum);
    }
}
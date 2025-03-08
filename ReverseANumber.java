import java.util.Scanner;
class ReverseANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scan.nextInt();
        int rem, rev =0, count =0, enter = 0;
        while(n>0){
            rem = n%10;
            if(rem == 0 && enter == 0){
                count++;
            }
            enter++;
            rev = (rev*10)+rem;
            n = n/10;
        }
        if(count == 1){
            System.out.println("reverse of given number is 0"+rev);
        }
        else{
            System.out.println("reverse of given number is "+rev);
        }
        
    }
}

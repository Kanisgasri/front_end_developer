import java.util.Scanner;
class Multiply{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i=1;i<=1000;i++){
			if((num*i)>1000){
				break;
			}
			System.out.println(num*i);
		}
	}
}
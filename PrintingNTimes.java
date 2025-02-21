import java.util.Scanner;
class PrintingNTimes{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int times = scan.nextInt();
		for(int i=1;i<=times;i++){
			System.out.println(num);
		}
	}
}

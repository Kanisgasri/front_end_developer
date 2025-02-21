import java.util.Scanner;
class PrintName{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String firstName = scan.nextLine();
		String lastName = scan.nextLine();
		int num = scan.nextInt();
		String fullName = firstName + lastName;
		for (int i=1; i<=num; i++){
			System.out.println(fullName);
		}
	}
}
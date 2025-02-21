import java.util.Scanner;
class Main{
	public static void main(String [] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter age, name, section:");
		int a = scan.nextInt();
		scan.nextLine();
		String s = scan.nextLine();
		char c = scan.next().charAt(0);
		System.out.println("age: "+a);
		System.out.println("name: "+s);
		System.out.println("character: "+c);
	}
}
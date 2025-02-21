import java.util.Scanner;
class Grade{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();
		if(grade>=90){
			System.out.println("Grade A");
		} else if(grade>=80){
			System.out.println("Grade B");
		} else if(grade>=60){
			System.out.println("Grade C");
		} else if(grade>=35){
			System.out.println("Grade D");
		} else if(grade<35){
			System.out.println("Fail");
		}
		
	}
}
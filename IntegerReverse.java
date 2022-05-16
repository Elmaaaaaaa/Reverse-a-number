import java.util.Scanner;

public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		String enterString = input.nextLine();

		int len = enterString.length();
		System.out.println("Reverse number is: ");
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(enterString.charAt(i));
		}

		input.close();

	}

}

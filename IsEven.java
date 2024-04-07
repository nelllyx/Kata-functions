import java.util.Scanner;

public class  IsEven{

	public static void main(String [] args){


System.out.print("Enter a number: ");


Scanner input = new Scanner(System.in);

	int userNumber = input.nextInt();


	boolean evenNumber = Kata.even(userNumber);

System.out.println(evenNumber);


}


}
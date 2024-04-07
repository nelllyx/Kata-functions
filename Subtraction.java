import java.util.Scanner;

public class Subtraction{


	public static void main(String [] args){



Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");

	int firstVal = input.nextInt();


System.out.print("Enter another number: ");

	int secondVal = input.nextInt();


	int value = Kata.sub(firstVal,secondVal);

System.out.println(Math.abs(value));


}





}
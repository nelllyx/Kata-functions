import java.util.Scanner;


public class Factorial{

public static void main(String [] args){


Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");

int number = input.nextInt(); 

	int factorial = Kata.fac(number);

	System.out.printf("%s%d%s%d%n","The factorial of ", number, " is ", factorial);






}






}
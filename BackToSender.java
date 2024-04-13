import java.util.Scanner;

public class BackToSender{


	public static void main(String [] args){


System.out.println("How many successful deliveries were made today");

Scanner input = new Scanner(System.in);

int delivery = input.nextInt();


int pay = FunctionLogistic.rider(delivery);


System.out.println("Your payment at the end of the day is " + pay);








}








}
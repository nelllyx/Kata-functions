import java.util.Arrays;

public class FunctionSegment{


public static void  displayNumber(int number){

String [] [] segments ={ { "_","| |","|_|"} ,
 
			{" ", " | ", "|"},

                         {"_", "_ |", "| _" },


			{"_", "_ |", "_|"},


			{"| _", "|", "|"},


			{"_", "| _", "| _"},


			{"_", "| _", "| _ |"},


			{"_", "|", "|"},


			{"_", "| _ |", "| _ |"}


			


			





};


if(number >= 0 && number <= 9){


String [] userInput = segments[number];

for(String input : userInput){


System.out.println(input);


}

}




}

public static void main(String... args){
 FunctionSegment.displayNumber(1);
}
}
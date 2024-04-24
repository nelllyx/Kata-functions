import java.util.Arrays;

public class BoolArray{

public static void main(String [] args){

int [] numbers = {4,5,8,8,8,2,9};

boolean [] arrays = array(numbers);
//array(numbers);


System.out.print(Arrays.toString(arrays));


}

public static boolean [] array(int [] numb){

boolean [] drillArray = new boolean[numb.length];

for(int index = 0; index < numb.length; index++){

drillArray[index] = numb[index] % 2 != 0;

}


return drillArray;




}




}
import java.util.Arrays;

public class BinaryArray{

public static void main(String [] args){

int [] numbers = {4,5,8,8,8,2,9};

//array(numbers);


System.out.print(Arrays.toString(array(numbers)));


}

public static int [] array(int [] numb){

for(int index = 0; index < numb.length; index++){

if(numb[index] % 2 == 0){

numb[index] = 0;

}else{

numb[index] = 1;

}


}

return numb;

}


}
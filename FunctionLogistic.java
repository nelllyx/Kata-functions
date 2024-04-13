public class FunctionLogistic{


public static int rider(int payment){

int basePay = 5000;

int firstParcel = 160;

int secondParcel = 200;

int thirdParcel = 250;

int fourthParcel = 500;

int salary = 0;

if(payment < 50){

salary = (payment * firstParcel) + basePay;


}else if(payment >=50  && payment < 59){

salary = (payment * secondParcel) + basePay;


}else if(payment >=60 && payment < 69){

salary = (payment * thirdParcel) + basePay;



}else if(payment >= 70){

salary = (payment * fourthParcel) + basePay;




}




return salary;



}



}
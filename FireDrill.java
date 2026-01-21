import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;

public class FireDrill{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

//System.out.println(Arrays.toString(taskTwo()));

//taskTwo();
taskThree();

int[] myArray = {3,7,5,4,7,8,7,5};

//System.out.println(Arrays.toString(taskFive(myArray)));

//System.out.println(taskNine(myArray));

//System.out.println(taskEleven(myArray));

//System.out.println(Arrays.toString(taskTwelve(myArray)));

//System.out.println(Arrays.toString(taskThirteen(myArray)));
}


public static int[] taskOne(){
Scanner input = new Scanner(System.in);

int[] myArray = new int[10];

for(int count = 0; count < 10; count++){

System.out.println("Enter number " + (count + 1 ));
int number = input.nextInt();

myArray[count] = number;

}



return myArray;

}


public static void taskTwo(){
Scanner input = new Scanner(System.in);

int[] myArray = new int[10];

for(int count = 0; count < 10; count++){

System.out.println("Enter number " + (count + 1 ));
int number = input.nextInt();

myArray[count] = number;

}

System.out.println("");

for(int counter = 0; counter < 10; counter++){

System.out.println(myArray[counter]);

}
}


public static void taskThree(){
Scanner input = new Scanner(System.in);

int[] myArray = new int[10];

for(int count = 0; count < 10; count++){

System.out.println("Enter number " + (count + 1 ));
int number = input.nextInt();

myArray[count] = number;

}

System.out.println("");

for(int counter = 0; counter < 10; counter++){



System.out.print(myArray[counter]);

}
}

public static int[] taskFour(int[] myArray){


int[] myNewArray = new int[myArray.length/2];
int index = 0;
for(int count = 0; count < myArray.length;count++){
if(count % 2 == 0){

myNewArray[index] = myArray[count];
index++;
}
}
return myNewArray;
}

public static int[] taskFive(int[] myArray){


int[] myNewArray = new int[myArray.length/2];
int index = 0;
for(int count = 0; count < myArray.length;count++){
if(count % 2 != 0){

myNewArray[index] = myArray[count];
index++;
}
}
return myNewArray;
}


public static int taskSix(int[] myArray){

int[] myNewArray = new int[myArray.length/2];
int index = 0;
for(int count = 0; count < myArray.length;count++){
if(count % 2 == 0){

myNewArray[index] = myArray[count];
index++;
}
}

int sum = 0;

for(int counter = 0; counter < myNewArray.length; counter++){

sum += myNewArray[counter];

}

return sum;

}


public static int taskSeven(int[] myArray){

int[] myNewArray = new int[myArray.length/2];
int index = 0;
for(int count = 0; count < myArray.length;count++){
if(count % 2 != 0){

myNewArray[index] = myArray[count];
index++;
}
}

int sum = 0;

for(int counter = 0; counter < myNewArray.length; counter++){

sum += myNewArray[counter];

}

return sum;

}



public static int taskEight(int[] myArray){

int[] myNewArray = new int[myArray.length/2];
int index = 0;
for(int count = 0; count < myArray.length;count++){
if(count % 2 == 0){

myNewArray[index] = myArray[count];
index++;
}
}

int minimum = myNewArray[0];

for(int counter = 0; counter < myNewArray.length; counter++){
if(myNewArray[counter] < minimum){

minimum = myNewArray[counter];

}



}
return minimum;
}

public static int taskNine(int[] myArray){

int[] myNewArray = new int[myArray.length/2];
int index = 0;
for(int count = 0; count < myArray.length;count++){
if(count % 2 != 0){

myNewArray[index] = myArray[count];
index++;
}
}

int minimum = myNewArray[0];

for(int counter = 0; counter < myNewArray.length; counter++){
if(myNewArray[counter] < minimum){

minimum = myNewArray[counter];

}



}
return minimum;
}

public static int taskTen(int[] myArray){

int[] myNewArray = new int[myArray.length/2];
int index = 0;
for(int count = 0; count < myArray.length;count++){
if(count % 2 == 0){

myNewArray[index] = myArray[count];
index++;
}
}

int maximum = myNewArray[0];

for(int counter = 0; counter < myNewArray.length; counter++){
if(myNewArray[counter] > maximum){

maximum = myNewArray[counter];

}
}
return maximum;
}

public static int taskEleven(int[] myArray){

int[] myNewArray = new int[myArray.length/2];
int index = 0;
for(int count = 0; count < myArray.length;count++){
if(count % 2 != 0){

myNewArray[index] = myArray[count];
index++;
}
}

int maximum = myNewArray[0];

for(int counter = 0; counter < myNewArray.length; counter++){
if(myNewArray[counter] > maximum){

maximum = myNewArray[counter];

}



}
return maximum;
}


public static int[] taskTwelve(int[] myArray){

//int[] myNewArray = new int[myArray.length]

//int index = 0;
int temporaryVariable = 0;

for(int count = 0; count < myArray.length; count++){
if(count % 2 != 0){
temporaryVariable = myArray[count];
myArray[count] = myArray[count - 1];
myArray[count - 1] = temporaryVariable;


}


}

return myArray;

}


public static int[] taskThirteen(int[] myArray){

int temporaryVariable = 0;

for(int count = 0; count < myArray.length; count++){
if(count % 2 != 0){

if(myArray[count] % 2 != 0 && myArray[count -1] % 2 != 0){
temporaryVariable = myArray[count];
myArray[count] = myArray[count - 1];
myArray[count - 1] = temporaryVariable;

}
}


}

return myArray;

}


public static int[] taskFourteen(int[] myArray){

int temporaryVariable = 0;

for(int count = 0; count < myArray.length; count++){
if(count % 2 != 0){

if(myArray[count] % 2 == 0 && myArray[count -1] % 2 == 0){
temporaryVariable = myArray[count];
myArray[count] = myArray[count - 1];
myArray[count - 1] = temporaryVariable;

}
}


}

return myArray;

}

public static int[] taskFifteen(int[] myArray){

int temporaryVariable = 0;

for(int count = 0; count < myArray.length; count++){
if(count % 2 != 0){

if(myArray[count] % 2 == 0 || myArray[count -1] % 2 == 0){
temporaryVariable = myArray[count];
myArray[count] = myArray[count - 1];
myArray[count - 1] = temporaryVariable;

}
}


}

return myArray;

}

public static int[] taskSixteen(int[] myArray){

int temporaryVariable = 0;

for(int count = 0; count < myArray.length; count++){
if(count % 2 != 0){

if(myArray[count] % 2 != 0 || myArray[count -1] % 2 != 0){
temporaryVariable = myArray[count];
myArray[count] = myArray[count - 1];
myArray[count - 1] = temporaryVariable;

}
}


}

return myArray;

}
}

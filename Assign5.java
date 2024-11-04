import java.lang.Math;

// chegg class

// you can change the name if you want

public class Assign5{

// static array of size 40 for recursive method

static int binary[]=new int[40];

// static int variable for indexing

static int index=0;

// main method as in question

public static void main(String args[])

{

int input;

input = Integer.parseInt(args[0]);

print_recursion(input);

print_binary(input);

}

//Iterative method

public static void print_binary(int input)

{

// Final int variable to store actual input value

final int number=input;

// if input is 0 then we directly output 0

if(input==0)

System.out.print("The binary representation of " + number +" is (using iteration): 0");

else

{

// Here different set of array is created

// the static array is only used by recursive method

// for this method we have seperate array and index variable

int binary[]=new int[40];

int index=0;

//iterative logic

while(input > 0){

binary[index++] = input%2;

input = input/2;

}

// printing the array stack in reverse order

System.out.print("The binary representation of " + number +" is (using iteration): ");

for(int i = index-1;i >= 0;i--){

System.out.print(binary[i]);

}

}

System.out.println();

}

// Recursive method

public static void print_recursion(int input)

{

int number=0;

// if input is 0 and index is 0 then that is the case when we have given 0 input

if (input == 0&&index==0)

{

System.out.println("The binary representation of " +number+" is (using recursion ): 0");

return ;

}

// This is the base case of recursion

if (input == 0)

{

// This for converts the binary to decimal to get the actual value of input

for(int i = index-1;i >= 0;i--){

number+=binary[i]*(Math.pow(2,i));

}

// printing

System.out.print("The binary representation of " +number+" is (using recursion ): ");

// printing binary values

for(int i = index-1;i >= 0;i--){

System.out.print(binary[i]);

}

System.out.println();

return ;

}

// recursive logic

else

{

binary[index++] = input%2;

print_recursion(input/2);

}

}

}
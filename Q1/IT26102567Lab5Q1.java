import java.util.Scanner;

public class IT26102567Lab5Q1{
	public static void main(String[] args){ 
	
	//Create new scanner object to input from the keyboard
	Scanner input = new Scanner(System.in); 
	
	//Declare the variables
	int num1, num2, num3, Smallest, Largest;
	
	//Input data using a keyboard
	System.out.print("Enter the first integer: ");
	num1 = input.nextInt();
	
	System.out.print("Enter the second integer: ");
	num2 = input.nextInt();
	
	System.out.print("Enter the third integer: ");
	num3 = input.nextInt();
	
	//Display the results 
	 System.out.println();
	 System.out.println("The user entered these integers: " + num1 +" " + num2 +" " + num3);
	
	//Compare variables to find Smallest and Largest variables
	 if (num1 > num2 && num1 > num3){
		 Largest = num1;
		 System.out.print("The first integer is the largest: " + num1);
	 } 
		 
	 if (num1 < num2 && num1 < num3){
		Smallest = num1;
		 System.out.print("The first integer is the smallest: " + num1); 
		 
	 }
	 
	 if (num2 > num1 && num2 > num3){
		 Largest = num2;
		 System.out.print("The second second integer is the largest: " + num2);
		 
	 }
	
	 if (num2 < num1 && num2 < num3){
		 Smallest = num2;
		 System.out.print("The second integer is the smallest: " + num2);
		 
	 } 
	 
	 if (num3 > num1 && num3 > num2){
		 Largest = num3; 
		 System.out.print("The third intger is the largest: " + num3);
	 }
	 
	 if (num3 < num1 && num3 < num2){
		 Smallest =  num3; 
		 System.out.print("The third integer is the smallest: " + num3);
		 
		 input.close();
		 
		 
		 
	 }
	 
	 
	 
	}
	
}
	 


	
	
		 
	
	
	

	
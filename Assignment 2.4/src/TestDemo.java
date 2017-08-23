import java.util.Scanner;  //Importing Scanner Class to take user input

class CheckNum {     //class created to check the number is negative, positive or is zero
	
	public void Check( int num) {         //class to check is created
		
		if(num == 0)				//checks if the number is equal to zero
		{
			System.out.println("The number you have entered is 0");  //prints on the console that the entered number is 0
		}
		else if(num < 0)		//checks if the number is less than zero 
		{
			System.out.println("The number is Negative");     //prints on the console that the entered number is negative
		}
		else 			//if condition is false goes to the next part of the condition
		{
			System.out.println("The number is positive");   //prints on the console that the number is positive
		}
	}
}     //end of class

class Grade {   //class created to calculate the percentage and assign the grades accordingly
	
	public void GetGrade(int sub1, int sub2, int sub3)   //method to calculate the percentage and give the grades
	{
		int totalmarks = 0;   //declaration of the variable and assigning it with zero
		float percentage;  //Declaration of variables
		
		totalmarks = sub1 + sub2 + sub3;    //calculates the total marks of three subjects
		percentage = totalmarks/3;			// calculates the percentage 
		if(percentage > 70)				//checks if the percentage is greater than seventy
		{
			System.out.println("You have recieved A grade");    //prints the output on the console
		}
		else if(percentage <= 70 && percentage > 60)    //checks if the percentage lies between 70 and 60
		{
			System.out.println("You have recieved B grade");    //prints the output on the console
		}
		else 							//if both condition is false goes to this part	
		{
			System.out.println("You have recieved C grade");     //prints the output on the console
		} 
	}
}

public class TestDemo {     //main class that hold the main method of the program

	public static void main(String[] args) {   //main method of the program
		
		int sub1, sub2, sub3, ch = 0, num; //Declaration of variables in integer data type
		char choice;				//Declaration of variable in character data type
		
		Scanner scan = new Scanner(System.in);  //creating object of scanner class
		
		Grade g = new Grade();        //creating the object of grade class
		CheckNum cn = new CheckNum();  //creating the object of checknum class
		
		do {		//Menu driven program
			
			System.out.println("******** Menu *********");       //printing the menu for the program on the console
			System.out.println("1. To Check of the entered number is positive, neagtive or zero");
			System.out.println("2. Student Grading Report");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: ");  //asking for choice from the user
			ch = scan.nextInt();    //taking to input choice from the user
			
			switch(ch)	//to choose from the menu option in the program and run the particular option
			{
			case 1: 
				System.out.println("Enter the a number: ");   //printing the message to take input from the user
				num = scan.nextInt();   //taking the input from the user 
				cn.Check(num);   //calling the method suing the object of the class and passing the value to the method taken from the user
				break;     //comes out of the current program (ends the program) as soon as the execution is done 
			case 2:
				System.out.println("Enter marks for Physics: ");   //printing the message to take input from the user
				sub1 = scan.nextInt();		//taking the input from the user 
				System.out.println("Enter marks for Chemistry: ");   //printing the message to take input from the user
				sub2 = scan.nextInt();		//taking the input from the user 
				System.out.println("Enter marks for Mathematics: ");   //printing the message to take input from the user
				sub3 = scan.nextInt();		//taking the input from the user 
				g.GetGrade(sub1, sub2, sub3);    //calling the method of the class using class object
				break;		//comes out of the current program (ends the program) as soon as the execution is done 
			case 3:
				System.exit(0);		//exits the program as soon as the option 3 is chosen by the user
			default: System.out.println("Please select correct choice");   //prints this message if the user inputs a choice outside the given range
			}
			System.out.println("Do you want to Continue(Y/N): ");   //prints the message on the console to get the input from the user if the user want to continue with the current program
			choice = scan.next().charAt(0);   //takes the user input as character 
			
			}while(choice == 'Y' || choice == 'y'); //to run the program until the user hits N/n
		
	}
}

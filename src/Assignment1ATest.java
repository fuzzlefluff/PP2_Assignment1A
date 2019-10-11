import java.util.Scanner;
public class Assignment1ATest {

	public static void main(String[] args) {
		//variables to store input
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		
		//Setup our scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt and store user input
		System.out.print("Enter the value of A: ");
		a = input.nextDouble();
		System.out.print("Enter the value of B: ");
		b = input.nextDouble();
		System.out.print("Enter the value of C: ");
		c = input.nextDouble();
		System.out.print("Enter the value of D: ");
		d = input.nextDouble();
		System.out.print("Enter the value of E: ");
		e = input.nextDouble();
		System.out.print("Enter the value of F: ");
		f = input.nextDouble();
		System.out.println();
		
		//create an equations object from the user input
		LinearEquation e1 = new LinearEquation(a,b,c,d,e,f);
		
		//test and store if e1 can be solved
		boolean e1isSolv = e1.isSolvable();
		
		//Check to see if the equations can be solved, if not, tell the user that the equation can't be solved
		if(e1isSolv == true) 
		{
			//If the equations can be solved, they are solved and the results displayed
			System.out.println("The equations can be solved!");
			System.out.println("The value of X is: " + e1.getX());
			System.out.println("The value of Y is: "+ e1.getY());
		}
		else{System.out.print("The equation cannot be solved");}

	}

}

package Chapter5;

//Elvis Nunez
//Description: Ask the user for the starting year and ending year,and 
//At the end, the program will print the correct total number of leap years
import java.util.Scanner;
public class Nuneelvi_Program1{

	public static void main(String[] args) {

		int starting = 0;
		int ending = 0;
		int count = 0;
		int x = 0;
		int y = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the starting year");
		starting = in.nextInt();
		System.out.println("Enter the ending year");
		ending = in.nextInt();
		System.out.print("\n");
		System.out.print("\n");

		for ( y = starting;  y <= ending; y++)
		{
			if( (y % 4 == 0) && (y %100 != 0) || ( y % 400 == 0)  ) 
			{

				System.out.print(y + " ");
				count++;
				x++;
			}
			if (count % 10 == 0 && count >0)
			{
				System.out.println();

				count = 0;
			}  
		}
		System.out.println();
		System.out.print("\n");
		System.out.println("There are " + x + " years" + " between " + starting +" and " + ending);
	}
}




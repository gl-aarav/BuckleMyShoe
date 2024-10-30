/* Aarav Goyl
 * 10/29/24
 * BuckleMyShoe.java
 * Get int from the user, use conditional statements to determine and print
 * the associated line from "Buckle My Shoe."
 * 
 * Working on: if - else statements
 * Testing: Only integers between 1 & 10 (inclusive) should give a line,
 * everything else gives an error message.
 * 
 * Pseudocode 
 * FV - line
 * 
 * main
 * 		create an instance of class, use it to call findIt
 * 
 * findIt
 * 		D&I var byte - input num
 * 		var - call getInput()
 * 		call decideWhich(pass in var)
 * 		call print()
 * 
 * getInput
 * 		Welcome/prompt
 * 		D&I Scanner
 * 		read input
 * 		return input
 * 
 * decideWhich(recives parameter bye - ine number)
 * 		use if - else to see which line entered
 * 		save to FV
 * print()
 * 		print the line
 */
 
import java.util.Scanner; //Import the Scanner class
public class BuckleMyShoe
{
	private String line;
	
	public BuckleMyShoe()
	{
		line = new String("");
	}
	public static void main (String [] args)
	{
		BuckleMyShoe bms = new BuckleMyShoe();
		bms.findIt();
	}
	public void findIt()
	{
		byte var = getInput();
		decideWhich(var);
		print();
	}
	public byte getInput()
	{
		Scanner in = new Scanner (System.in);
		System.out.print("\n\n\n\t\t\t Welcome to Buckle My Shoe!\nEnter a number from 1-10: ");
		return in.nextByte();
	}
	public void decideWhich(byte num)
	{
		if (num==1 || num==2)
		{
			line = "1, 2, Buckle my shoe";
		}
		else if (num==3 || num==4)
		{
			line = "3, 4, Shut the door";
		}
		else if (num==5 || num==6)
		{
			line = "5, 6, pick up sticks";
		}
		else if (num==7 || num==8)
		{
			line = "7, 8, Lay them straight";
		}
		else if (num==9 || num==10)
		{
			line = "9, 10, Big fat hen";
		}
		else
		{
			line = "You did not enter a valid input";
		}		
	}
	public void print()
	{
		System.out.println(line + "\n\n\n");
	}	
} 	

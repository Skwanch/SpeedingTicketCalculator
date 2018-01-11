// F16 CS 401 Speeding Ticket Project
// Project1.java Starter File

import java.io.*;
import java.util.*;

public class Project1
{
	public static void main (String args[])
	{
		// Create a scanner to read from keyboard
		Scanner kbd = new Scanner (System.in);

		String firstName="N/A",lastName="N/A";
		int age=0, speedLimit=0, actualSpeed=0, mphOverLimit=0;
		int baseFine=0, underAgeFine=0, zoneFine=0, totalFine=0;
		// DO NOT ADD TO OR MODIFY ABOVE THIS LINE
		
		
		System.out.println("Enter your first and last name.");
		firstName = kbd.next();
		lastName = kbd.next();
		
		System.out.println("How old are you?");
		age = kbd.nextInt();
		
		System.out.println("What is the speed limit?");
		speedLimit = kbd.nextInt();
		
		System.out.println("What was your speed?");
		actualSpeed = kbd.nextInt();
		
		System.out.println("Were you in a construction zone (true/false) ?");
		boolean constrZone = kbd.nextBoolean(); //constrZone IS SHORT FOR CONSTRUCTION ZONE
		
		// ESTABLISHING MPH OVER LIMIT
		if (actualSpeed > speedLimit)
		{
			mphOverLimit = actualSpeed-speedLimit;
		}
		else 
		{
			mphOverLimit = 0;
		}
		
		// CALCULATING BASE FINE
		if (mphOverLimit < 5)
		{
			baseFine = 0;
		}
		else if (mphOverLimit<=20)
		{
			baseFine = (mphOverLimit/5)*30;
		}		
		else //IF MORE THAN 20 MPH OVER LIMIT
		{
			baseFine = (mphOverLimit/5)*50;
		} 
		
		// ZONE FINE
		if (constrZone == true)
		{
			zoneFine = baseFine;
		} 
		else //constrZone == false
		{	
			zoneFine = 0; 
		}
		
		//UNDERAGE FINE
		if (age < 21 && mphOverLimit > 20)
		{
			underAgeFine = 300;
		}
		else 
		{
			underAgeFine = 0;
		}
		
		//TOTAL 
		totalFine = baseFine + zoneFine + underAgeFine;

		// DO NOT ADD TO OR MODIFY BELOW THIS LINE
		System.out.println();
		System.out.format( "name: %s, %s\n",lastName,firstName );
		System.out.format( "age: %d yrs.\n",age );
		System.out.format( "actual speed: %d mph.\n",actualSpeed );
		System.out.format( "speed limit: %d mph.\n",speedLimit );
		System.out.format( "mph over limit: %d mph.\n",mphOverLimit );
		System.out.format( "base fine: $%d\n",baseFine );
		System.out.format( "zone fine: $%d\n",zoneFine );
		System.out.format( "under age fine: $%d\n",underAgeFine );
		System.out.format( "total fine: $%d\n",totalFine );
	} // END MAIN
} // END PROJECT1 CLASS
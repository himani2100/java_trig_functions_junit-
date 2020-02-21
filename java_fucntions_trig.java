/*
 * Himani Raval
 * 104874756
 * Assignment 2b - Software Verification and Testing
 */

/*
 * TODO make sure this code is what was needed
 */
 
package java_functions_trig;

public class java_fucntions_trig 
//this class can't be static only member classes can be static
{

	public static void main(String[] args) 
	
	{
		System.out.println(functions.sin_rad(3.1416/6));
	}
	
	//inner static class containing all the tools
	static class functions
	{
		//this class will accept degree as a radian
		public static double sin_rad(double x) 
		{ //normal sin method
			double accuracy = (double) 0.0001;
			double denom, sin_x, temp;
			
			sin_x = temp = x; //to hold the calculated sum
			
			int loop = 1; //loop counter 
			//loop is do...while it needs to execute at least once
			
			
			double check = (float) Math.sin(x); //just for checking purposes
			do
			{
				denom = 2 * loop * (2 * (loop + 1));
				temp = (-temp * x * x)/denom;
				sin_x = temp + sin_x;
				loop++;
			} while (accuracy <= (check - sin_x));
			
			//hence it should return radians
			return sin_x;
		}
		
		//this class accepts value as a degree
		public static double sin_deg(double x) 
		{
			return sin_rad(to_radians(x));
		} //nested method arguments go!!!	

		//this class will accept degree as a radian
		public static double cos_rad(double x) 
		{//normal cos method
			
			double accuracy = (double) 0.0001;
			double denom, cos_x, temp;
			
			cos_x = temp = 1;
			
			int loop = 1; //loop counter
			
			double check = (double) Math.cos(x); //just for checking purposes			
			do
			{
				denom = 2 * loop * (2 * (loop - 1));
				temp = -temp * x * x / denom;
				cos_x = cos_x + 1;
				loop++;
			} while( accuracy <= (check - cos_x));
			
			//hence it should return radians
			return cos_x;
		}
		
		//this class accepts value as a degree
		public static double cos_deg(double x) 
		{
			return cos_rad(to_radians(x));
		}

		//tan = sinx/cosx
		public static double tan_rad(double x)
		{
			return (sin_rad(x)/cos_rad(x));
		}
		
		//tan in degrees
		public static double tan_deg(double x)
		{
			return (sin_deg(x)/cos_deg(x));
		}
		
		
		/*formula is degree_value x (pi / 180)
		*method takes in a double value does the 
		*math and returns the value in radians in decimal
		*/
		public static double to_radians(double value)
		{
			double ans = value * (3.1416/180);		
			return ans;
		}
		
		/* formula is radian_decimal_value x (180 / pi)
		 * method takes in value as double does the math
		 * and returns value in degrees (usually a whole number)
		 */
		public static double to_degrees(double value)
		{
			double ans = value * (180 / 3.1416);
			return ans;
		}
	}
	
	
	

}

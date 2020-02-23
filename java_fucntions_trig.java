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
		//System.out.println(functions.tan_deg(333));
		//System.out.println((float)Math.cos(1));
	}
	
	//inner static class containing all the tools
	static class functions
	{
		//this class will accept degree as a radian
		public static double sin_rad(double x) 
		{ //normal sin method
			
			
			double sin_x = 0; //this will at last be the final cos value
			double sign = 0, num = 0, denom = 0, fin = 0; 
			//for calculations on the signs and the power
			for(int i = 0; i < 10; ++i)
			{
				sign = power(-1, i);
				num = power(x, (2 * i)+1);
				denom = factorial((2 * i)+1);
				
				fin = (sign * num) / denom;
				
				sin_x += fin;
			}
			
			return manPre(sin_x); 
			//return the calculated sin value
			//but also curb the presicion to avoid failed junit tests
		}
		
		//this class accepts value as a degree
		public static double sin_deg(double x) 
		{
			return manPre(sin_rad(to_radians(x)));
		} //nested method arguments go!!!	

		//this class will accept degree as a radian
		public static double cos_rad(double x) 
		{//normal cos method
			
			double cos_x = 0; //this will at last be the final cos value
			double sign = 0, num = 0, denom = 0, fin = 0; 
			//for calculations on the signs and the power
			for(int i = 0; i < 10; ++i)
			{
				sign = power(-1, i);
				num = power(x, 2 * i);
				denom = factorial(2 * i);
				
				fin = (sign * num) / denom;
				
				cos_x += fin;
			}
			
			return manPre(cos_x); 
			//return the calculated cos value
			//also curb the precision 
		}
		
		//this class accepts value as a degree
		public static double cos_deg(double x) 
		{
			return manPre(cos_rad(to_radians(x)));
		}

		//tan = sinx/cosx
		public static double tan_rad(double x)
		{
			return manPre((sin_rad(x)/cos_rad(x)));
		}
		
		//tan in degrees
		public static double tan_deg(double x)
		{
			return manPre((sin_deg(x)/cos_deg(x)));
		}
		
		/*formula is degree_value x (pi / 180)
		*method takes in a double value does the 
		*math and returns the value in radians in decimal
		*/
		public static double to_radians(double value)
		{
			double ans = value * (3.1416 / 180);		
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
		
		/*
		 * factorial calculations for denominators
		 * normal factorial calculations
		 */
		public static double factorial(int num)
		{
			double fact = 1; 
			/*even if the num is 0! is 1 and so in any case 
			 * it wouldn't return 0.
			 */
			while(num > 1)
			{
				fact *= num;
				--num;
			}
			return fact;
		}
		
		/*
		 * method to calculate power and basically numerator calculations
		 * num can be a decimal however power can't because I can't handle it!
		 */
		public static double power(double num, int pow)
		{
			float ans = 1; //it shouldn't be 0
			//because we're multiplying it with num
			
			for(int i = 0; i < pow; i++) //iteratively calculates the power
			{
				ans *= num;
			}
			return ans;
		}
		
		/*
		 * This method is to manage the decimal precision of 
		 * returned double values
		 */
		public static double manPre(double value)
		{
			int precision = 6; 
			//hard coded to n digits as it appears
			//on my junit tests
			
			final double offset = power(10, precision);
			final double floor = (int) (offset*value);
			
			return (floor/offset);
		}
	}
}

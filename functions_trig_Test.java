/*
 * Himani Raval
 * 104874756
 * Assignment 2b - Software Verification and Testing
 * Test file :)
 */



package java_functions_trig;

import junit.framework.TestCase;
import java_functions_trig.java_fucntions_trig;
//package first and then the class name. 
//important to be able to access the methods and test them
import java_functions_trig.java_fucntions_trig.functions;

public class functions_trig_Test extends TestCase 
{
	private static int angleDeg_1, angleDeg_2, angleDeg_3, angleDeg_4;
	private static double angleRad_1, angleRad_2, angleRad_3, angleRad_4;
	/*
	 * These angle values will be used to test the angles in the
	 * quadrant circle
	 */
	
	/*
	 * Constrcutor class
	 */
	public functions_trig_Test(String testname)
	{
		super(testname);
	}
	
	/*
	 * sets up the angles with values to be tested. Each angle value
	 * has been randomly selected with one restriction, each should 
	 * belong inside a different quadrant then its peers.
	 */
	protected void setUp() throws Exception 	
	{
		super.setUp();
		
		//Degrees
		angleDeg_1 = 75; //an angle in the first quadrant
		angleDeg_2 = 115; //an angle in the second quadrant
		angleDeg_3 = 260; //an angle in the third quadrant
		angleDeg_4 = 333; //an angle in the forth quadrant
		
		//Radians
		angleRad_1 = 1;//an angle in the first quadrant
		angleRad_2 = 2; //an angle in the second quadrant
		angleRad_3 = 4; //an angle in the third quadrant
		angleRad_4 = 5; //an angle in the forth quadrant
	}
	
	/*
	 * sets up the angles with values initialized to 0;
	 */
	protected void tearDown() throws Exception
	{
		super.tearDown();
		
		//Degrees
		angleDeg_1 = 0; 
		angleDeg_2 = 0; 
		angleDeg_3 = 0; 
		angleDeg_4 = 0;
		
		//Radians
		angleRad_1 = 0; 
		angleRad_2 = 0; 
		angleRad_3 = 0; 
		angleRad_4 = 0;
	} 

	
	/*
	 * This test class is designed to test the sin function that accepts 
	 * in radians only.
	 */
	/*
	public static void testSinRad()
	{
		double ans_1 = 0.84147096;
		double ans_2 = 0.9092974;
		double ans_3 = -0.7568025;
		double ans_4 = -0.9589243;
		
		assertEquals(functions.sin_rad(angleRad_1) ,ans_1);
		assertEquals(functions.sin_rad(angleRad_2), ans_2);
		assertEquals(functions.sin_rad(angleRad_3), ans_3);
		assertEquals(functions.sin_rad(angleRad_4), ans_4);
		//method to check if this actually worked.
		
	} 
	*/
	
	/*
	 * This test class is designed to test the sin function that accepts 
	 * in degrees only.
	 */
	/*
	public static void testSinDeg()
	{
		double ans_1 = 0.965926;
		double ans_2 = 0.906308;
		double ans_3 = -0.984808;
		double ans_4 = -0.453990;
		
		assertEquals(functions.sin_deg(angleDeg_1) ,ans_1);
		assertEquals(functions.sin_deg(angleDeg_2), ans_2);
		assertEquals(functions.sin_deg(angleDeg_3), ans_3);
		assertEquals(functions.sin_deg(angleDeg_4), ans_4);
		
		//method to check if this actually worked.
	}
	*/
	
	/*
	 * This test class is designed to test the cos function that accepts 
	 * value in radians only
	 */
	/*
	public static void testCosRad()
	{
		double ans_1 = 0.540302;
		double ans_2 = -0.416147;
		double ans_3 = -0.653644;
		double ans_4 = 0.283662;
		
		assertEquals(functions.cos_rad(angleRad_1), ans_1);
		assertEquals(functions.cos_rad(angleRad_2), ans_2);
		assertEquals(functions.cos_rad(angleRad_3), ans_3);
		assertEquals(functions.cos_rad(angleRad_4), ans_4);
	}
	*/
	
	/*
	 * This test class is designed to test the cos function that accepts 
	 * value in degrees only
	 */
	/*
	 public static void testCosDeg()
	{
		double ans_1 = 0.258819;
		double ans_2 = -0.422618;
		double ans_3 = -0.173648;
		double ans_4 = 0.891007;
		
		assertEquals(functions.cos_deg(angleDeg_1), ans_1);
		assertEquals(functions.cos_deg(angleDeg_2), ans_2);
		assertEquals(functions.cos_deg(angleDeg_3), ans_3);
		assertEquals(functions.cos_deg(angleDeg_4), ans_4);
	}
	*/
	
	/*
	 * This test class is designed to test the tan function that accepts 
	 * value in radians only
	 */
	/*
	 public static void testTanRad()
	 {
		 double ans_1 = 1.557408;
		 double ans_2 = -2.185040;
		 double ans_3 = 1.157821;
		 double ans_4 = -3.380515;
			 
		assertEquals(functions.tan_rad(angleRad_1), ans_1);
		assertEquals(functions.tan_rad(angleRad_2), ans_2);
		assertEquals(functions.tan_rad(angleRad_3), ans_3);
		assertEquals(functions.tan_rad(angleRad_4), ans_4);	 
	 }
	 */
	 
	 /*
		 * This test class is designed to test the tan function that accepts 
		 * value in degrees only
		 */
	 ///*
	 public static void testTanDeg()
	 {
		 double ans_1 = 3.732097;
		 double ans_2 = -2.144481;
		 double ans_3 = 5.671444;
		 double ans_4 = -0.510165;
			 
		//assertEquals(functions.tan_deg(angleDeg_1), ans_1);
		assertEquals(functions.tan_deg(angleDeg_2), ans_2);
		assertEquals(functions.tan_deg(angleDeg_3), ans_3);
		assertEquals(functions.tan_deg(angleDeg_4), ans_4);
		
		 
	 }
	 //*/
}

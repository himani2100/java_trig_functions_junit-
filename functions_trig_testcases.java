/*
 * Himani Raval
 * 104874756
 * Assignment 2b - Software Verification and Testing
 * Test file :)
 */



package java_functions_trig;

import static org.junit.Assert.*;

import org.junit.Test;

public class functions_trig_testcases {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
/*
 * 	static void cal_cos(float n) 
	{ 
        float accuracy = (float) 0.0001, x1, denominator, cosx, cosval; 
        // Converting degrees to radian 
        n = n * (float) (3.142 / 180.0); 
        x1 = 1; 
        // maps the sum along the series 
        cosx = x1; 
        // holds the actual value of sin(n) 
        cosval = (float) Math.cos(n); 
        int i = 1; 
        do 
        { 
            denominator = 2 * i * (2 * i - 1); 
            x1 = -x1 * n * n / denominator; 
            cosx = cosx + x1; 
            i = i + 1; 
              
        } 
        while (accuracy <= cosval - cosx); 
        System.out.println(cosx); 
      
    } 
  
   // Main function 
    public static void main(String[] args) 
    { 
        float n = 30; 
        cal_cos(n); 
      
    } 
 */

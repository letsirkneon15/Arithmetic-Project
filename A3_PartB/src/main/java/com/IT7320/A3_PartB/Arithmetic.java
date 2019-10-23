package com.IT7320.A3_PartB;

/**
 * Hello world! test Jenkins and Github integration
 * Change again
 *
 */
public class Arithmetic 
{
	
	private int x, y, sum;
	
    public Arithmetic(int x, int y) {
		this.x = x;
		this.y = y;
	}

    public static int add(int a, int b) {
    	return a+b;
    }
    
	public static void main( String[] args )
    {
		/* If there's no static object have to be created. Obj = Arithmetic obj = new Arithmetic(5,3);*/
		
        System.out.println( "Sum = " + add(5,3));
    }
}

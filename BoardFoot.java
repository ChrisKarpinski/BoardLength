/****************************************************************************
	 *
	 * Created by: Chris Karpinski
	 * Created on: Sept 2016
	 * This program has a function that calculates the third dimension of a 
	 *     rectangular prism given the other 2 dimensions
	 *
	 ****************************************************************************/

import java.util.Scanner;

public class BoardFoot {
	
	public static void main(String[] args) {
		
		int dimension1;
		int dimension2;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the first dimension");
		dimension1 = scan.nextInt();
		System.out.println("Enter the second dimension");
		dimension2 = scan.nextInt();
		System.out.println("The third dimension is: " + Dimension3(dimension1, dimension2));
	}
	
	public static int Dimension3 (int firstDimension, int secondDimension)
	{
		int thirdDimension;
		
		thirdDimension = 144/(firstDimension*secondDimension);
		
		return thirdDimension;
		
	}

}

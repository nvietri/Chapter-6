import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
//import javax.swing.*;

public class mathy
{
	private int [][] square;

	/**
		default constructor - stubed in

	*/
	public mathy()
	{
			System.out.println ("hi from default constructor");

	}

	public mathy(int [][] array)
	{
		square = array;

	}


	/**
		take the absoulute value of the number
		@param int value
		@return absoulute value of number
	*/
	public int abs (int x)
	{
		if (x < 0)
			x = -x;

		return x;



	}//end of abs






//}end of class




	/**
		takes the odd numbers out of an array
		@param int[] values
		@return int[] odd values in the array
	*/
	/*

	public  int[] getOdd ( int[] num1)
	{	oddnum = 21useful.getOdd(num);

		for (int s : oddnum)
		{
			System.out.println(s);
		}
		for( ; i<num1.length();i++)
		{
			if(num1[i] % 2 != 0)
			odd[i] = num1[i];
		}

		return odd;


	}//end of getOdd






	public void getEven(int[] num, int evennum [])
	{





	}//end of getEven







	/**
		two int parameters and adds them
		@param 2 int values
		@return int sum of values
	*/


	public int add (int x, int y)
	{	//System.out.println(sum );
		int sum;      //sum x and y are local var
		sum = x+y;

		return sum;


	}//end of add


	public double add (double x,double y)
	{

		return x+y;
	}

	/**
			message from Mathy class
			@param none
			@return String message
	*/


	public String toString()
	{
		return ("Hi what do you want?, I'm just Mathy");

	}


	public void switchThem (int[] a1, int a2[])
	{
		int [] temp = a1;




	}
	public void count(int[] a1, int[] a2)
	{
		for (int i : a1)
			a2[i] ++;



	}


	public static int sum2DArray(int [][] scores)
	{

		int total = 0;

		for ( int row=0; row < scores.length; row++)
		{
			for ( int col=0; col < scores[row].length; col++){
				System.out.print (scores[row][col] + "\t");
				total = total + scores[row][col];}

			System.out.println();
      	}


		return total;

	}



	public static int sumOneRow2DArray(int [] array)
	{	int total = 0;
		for(int i =0; i<array.length;i++)
			total = total + array[i];



		return total;

	}
	public static int sumOneCol2DArray(int[][] array,int col)
		{	int total = 0;
			for(int i =0; i<array.length;i++)
				total = total + array[i][col-1];



			return total;

	}





	public int[] sumall2DArray(int [][] scores)
	{
		int [] temp = {1,2,3,4,};




		return temp;
	}

	/**
		Doubles the size of an array
		@param int []
		@return int [] twice the size, with values copied over
	*/
   public static int[] doubleSize(int[] array)
   {
	   //make temp 2 times the size of array
	   int[] temp = new int[array.length * 2];
	   System.out.println(temp.length +"-" );

		//copy all the values over to new array
	   for (int i = 0; i < array.length; i++)
	   		temp[i] = array[i];

		//old array changes reference to new larger array
       array = temp;

		return array;

   }

















}//end of class
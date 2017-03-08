//Nicholas Vietri
//February 21, 2017
//Magic Square
//Program will take a 2D array, add the col, rows, and diags and see if they all add up to the same value
public class MagicSquare{
	int [][]square = new int[1][1];

	public MagicSquare(int [][] array)
	{
		square = array;
		
		int isRow = addRow(square);
		System.out.println(isRow);
		int isCol = addCol(square);
		System.out.println(isCol);
		int isDiag = addDiag(square);
		System.out.println(isDiag);
		//toString(square);
		//tests to see if any of the calculations output 0
		//if 0 that will trigger the first if statement
		if(isRow == 0 || isCol == 0 || isDiag == 0){
			System.out.println("This is not a magic square.");
			//System.out.println(isRow + "\n" + isCol + "\n" + isDiag);
}
		else{
			System.out.println("The magic number is:" + isRow);
			//System.out.println(isRow + "\n" + isCol + "\n" + isDiag);
}


	}
	public static int addCol(int[][]square){
		//creating a new array to add the column values too
		int col[] = new int[square.length];
		//initializing the return value
		int ret = 0;
		//creating the value for the col total
		int coltotal = 0;
		//for loop within a for loop that will add up all the values and reset it to zero after adding it to an array
		for(int i = 0;i<square.length;i++){
			//resets the col total so that it can be checked
			coltotal = 0;
			for(int d = 0;d<square[i].length;d++){
				coltotal+=square[d][i];
			}
			//adds the value to the array
			col[i]+=coltotal;

		}
		//for loop that goes through all the col total array values and tests to see if they are all equal
		for(int j = 0; j<col.length;j++){
			if(col[j] == coltotal)
				ret = coltotal;
			else{
				//breaks the loop and returns 0 if something doesnt match up
				ret = 0;
				break;}
		}

		return ret;

	}

	public static int addRow(int[][] square){
		//creating the array of row values
		int row[] = new int[square.length];
		//creating the return value
		int ret = 0;
		//creating the row total value, each item in the 2D array will be added up to this variable
		int rowtotal = 0;
		//for loop within a for loop that will add the values up and see if they are all the same
		for(int i =0; i< square.length;i++){
			//sets the rowtotal value  = zero, and resets it when the loop runs again
			rowtotal = 0;
			for(int k = 0; k<square[i].length;k++){
				rowtotal +=square[i][k];
			}
			//adding the rowtotal value to the 1D array
			row[i]+=rowtotal;
		}
		//testing all the values that were added to the 1D array
		for(int n = 0;n<row.length;n++){
			if(row[n] == rowtotal)
				ret = rowtotal;
			else{
				//sets the return value to 0 then breaks the loop
				ret = 0;
				break;}

		}


		return ret;
	}
	public static int addDiag(int[][] square){
		//creating the single dimension array that will have all the diagonal values added into it
		int diag[] = new int[square.length];
		//creaing the return value that will be set equal to the diagonal values all added up.
		int ret = 0;
		//setting the diagonal total  = 0 and reseting it when the loop reruns
		int diagtotal = 0;
		//for loop within a for loop that will go through all the diagonal values and see if they all add up to the same value
		for(int i = 0; i<square.length;i++){
			diagtotal = 0;
			for(int k = 0; k<square[i].length;k++){
				diagtotal += square[i][k];
				//i++;
		}
		//adding the diagonal total to the single dimension array
		diag[i] = diagtotal;
			}


		//another diagonal check to check the opposite diagonal
		//creating another array
		int diag2[] = new int[square.length];

		//initializing the return value to just zero
		int ret2 = 0;

		int diagtotal2 = 0;

		//for loop to run through the 2D array
		for(int n = 0; n < square.length; n++){
			diagtotal2 = 0;
			for(int u = square[n].length-1; u >= 0; u--){
				diagtotal2 += square[n][u];
			}
			//adding all of the values into the array
			diag2[n] += diagtotal2;
		}
		//for loop for checking all the values that were added into the single dimension array
		System.out.println("dtotal"+ diagtotal);
		System.out.println("dtotal2" + diagtotal2);
		if(diagtotal == diagtotal2)
			ret = diagtotal;
		else
			ret = 0;
			
		return ret;

	}//end of addDiag

	public String toString()
	{
		//int[][] square = array;
		for(int i = 0; i < square.length; i++)
		{
			for(int k = 0; k < square.length;k++)
				System.out.print(square[i][k] + "\t");
			System.out.println();
		}
		return "";

	}//end of toString




}//end of class

public class MagicSquare{

	public MagicSquare(int [][] array)
	{
		int [][]square = array;
		//int rows = square.length;
		//int cols = square[rows].length;

	}
	//public boolean isMagic(){



	//}
	public void getMagicNum(){


	}
	//public int setMagicSquare(int[][]square){



	//}
	public static int addRow(int row,int[][] square){
		int total = 0;
		for(int i =0; i< square.length-1;i++){
			total = total + square[0][i];
			for(int k = 0; k<square[row].length-1;k++)
				total = total + square[i][row];

		}

		return total;

	}




}//end of class
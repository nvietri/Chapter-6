public class MagicSquare{

	public MagicSquare(int [][] array)
	{
		int [][]square = array;
		//private int magicnum;
		//int rows = square.length;
		//int cols = square[rows].length;

	}
	public void getMagicNum(){
		int isRow = addRow(int[][]square);
		int isCol = addCol(int[][]square);
		if(isRow == 0 || isCol == 0)
			System.out.println("This is not a magic square.");
		else{
			System.out.println("The magic number is:" + isRow);

		}
	}
	public static int addCol(int[][]square){
		int col[] = new int[square.length];
		int ret = 0;
		int coltotal = 0;
		for(int i = 0;i<square.length;i++){
			coltotal = 0;
			for(int d = 0;d<square[i].length;d++){
				coltotal+=square[d][i];
			}
			col[i]+=coltotal;

		}
		for(int j = 0; j<col.length;j++){
			if(col[j] == coltotal)
				ret = coltotal;
			else{
				ret = 0;
				break;}
		}

		return ret;

	}
	public static int addRow(int[][] square){
		int row[] = new int[square.length];
		int ret = 0;
		int rowtotal = 0;
		for(int i =0; i< square.length;i++){
			rowtotal = 0;
			for(int k = 0; k<square[i].length;k++){
				rowtotal +=square[i][k];
			}
			row[i]+=rowtotal;
		}

		for(int n = 0;n<row.length;n++){
			if(row[n] == rowtotal)
				ret = coltotal;
			else{
				ret = 0;
				break;}

		}


		return ret;
	}




}//end of class
public class MagicSquare{

	public MagicSquare(int [][] array)
	{
		int [][]square = array;
		int isRow = addRow(square);
		int isCol = addCol(square);
		int isDiag = addDiag(square);
		if(isRow == 0 || isCol == 0 || isDiag == 0)
			System.out.println("This is not a magic square.");
		else
			System.out.println("The magic number is:" + isRow);
		//private int magicnum;
		//int rows = square.length;
		//int cols = square[rows].length;

	}
	//public void getMagicNum(){
		

	//	}
	//}
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
				ret = rowtotal;
			else{
				ret = 0;
				break;}

		}


		return ret;
	}
	public static int addDiag(int[][] square){
		int diag[] = new int[square.length];
		int ret = 0;
		int diagtotal = 0;
		for(int i = 0; i<square.length;){
			diagtotal = 0;
			for(int k = 0; k<square[i].length;k++){
				diagtotal += square[i][k];
				i++;
		}
		diag[i] = diagtotal;
			}
			
		for(int j = 0;j<diag.length;j++){
			if(diag[j] == diagtotal)
				ret = diagtotal;
			else{
				ret = 0;
				break;
			}
		}
		return ret;
		
	}//end of addDiag




}//end of class

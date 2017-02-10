public class MagicSquare{

	public MagicSquare(int [][] array)
	{
		int [][]square = array;
		//private int magicnum;
		//int rows = square.length;
		//int cols = square[rows].length;

	}
	//public boolean isMagic(){



	//}
	public void getMagicNum(){


	}
	//public int setMagicSquare(int[][]square){



	//}
	public static int addRow(int[][] square){
		//int row[] = new int[square.length];
		int total = 0;
		int rowtotal = 0;
		for(int i =0; i< square.length;i++){
			rowtotal = 0;
			for(int k = 0; k<square[i].length;k++){
				rowtotal += square[i][k];
				total += square[i][k];
				//System.out.println(square[i][k]);
				//System.out.println(total);
			}
		}

		if(rowtotal == (total/(square.length))){
			System.out.println("yes");
			return rowtotal;}
		else{
			System.out.println("no");
			return 0;}


	}




}//end of class
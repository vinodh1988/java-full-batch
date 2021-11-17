class TwoD{

   public static void main(String n[]){
       int matrix[][]=new int[3][3];
	   
	   matrix[0][0]=1;
	   matrix[0][1]=2;
	   matrix[0][2]=3;
	   matrix[1][0]=4;
	   matrix[1][1]=5;
	   matrix[1][2]=6;
	   matrix[2][0]=7;
	   matrix[2][1]=8;
	   matrix[2][2]=9;
	  
	   for(int row=0;row<matrix.length;row++){
		   
		   for(int col=0;col<matrix[row].length;col++){
			   System.out.print(matrix[row][col]+"  ");
		   }
		   System.out.println();
	   }
	   
   }
}
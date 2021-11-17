class TwoDVariableSize{

   public static void main(String n[]){
       int matrix[][]=new int[3][];
	   
	   matrix[0]=new int[5];
	   
	   matrix[0][0]=1;
	   matrix[0][1]=2;
	   matrix[0][2]=3;
	   matrix[0][3]=4;
	   matrix[0][4]=5;
	   
	   matrix[1]=new int[2];
	   
	   matrix[1][0]=6;
	   matrix[1][1]=7;
	  
	   matrix[2]=new int[3];
	   
	   matrix[2][0]=8;
	   matrix[2][1]=9;
	   matrix[2][2]=10;
	  
	   for(int row=0;row<matrix.length;row++){
		   
		   for(int col=0;col<matrix[row].length;col++){
			   System.out.print(matrix[row][col]+"  ");
		   }
		   System.out.println();
	   }
	   
   }
}
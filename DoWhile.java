class DoWhile{
   public static void main(String n[]){
        int i=1;
		int j=1;
		
		do{
			j=1;
			do{
				System.out.print(i+"  ");
				j++;
			}while(j<=i);
			i++;//change
			System.out.println();
		}while(i<10); //condition
   
   }
}
/*
1
1 2
1 2 3
1 2 3 4  


*/

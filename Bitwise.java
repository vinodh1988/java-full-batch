class Bitwise{
   public static void main(String n[]){
       int i=32;  //100000
	   int b=31;  //011111
	   int c=i&b; //000000  ->0
	   int q=i|b; //111111  ->63
	   int e=33;  //100001  
	   int p=i^e; //000001  ->1
	   System.out.println(c+" "+q+" "+p);
	   System.out.println(i>>2); //001000 -> 8
	   System.out.println(i<<2); //10000000 ->128
	   System.out.println(~i);  //0000000000000000000000100000
	                          //1111111111111111111111011111
	   System.out.println(~-33);						
   }
}



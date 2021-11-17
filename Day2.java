
class Literal{
	
	public static void main(String n[])
	{
		int i=90;
		byte b=120;
		short s=8034;
		long l=3408340L;
		
		float f=3435.34f;
		double d=434.34;
		
		
		System.out.println(i+" "+b+"  "+s+"  "+l);
		System.out.println(f+"  "+d);
		
		char c='a';
		System.out.println(c);
		
		boolean bl=true;
		System.out.println(bl);
		
		int x=b;
		double m=f;
		float k=(float)m; //typecasting
		int q=(int)l;
		int p=c;
		System.out.println(x+" "+m+" "+k+" "+q+" "+p);
		
		String n2="Young";
		System.out.println(n2);
	}
}


/*
  Variables   - Identifiers used to store Values or objects
  Data Types  - Keywords which used to specify  type of the data
  Literals  - Values given for variables
 
  Variable/method Naming Rules
  
  Convention
  
       Start with lowercase
	   If you class name has multiple words use camelcase 
	      ex: firstStep  , superOver,superStar,firstWord
		
  
  
  Rules
  
      Dont start the variable/method name with numbers but it can have numbers 
	  Dont use spaces
	  Dont use any special character except underscore
	  
  Java Has 8 primitive Data types support
  
  Numbers
  
        Integers
		                 byte   - 1byte  -8 bits
						 short   -2bytes -16 bits
						 int - 4 bytes  -32
						 long  -8 bytes  -64
	 
						 
		
		
		
		
		Floating point numbers
  
                         float - 4 bytes
						 double - 8 bytes
  
  Character
					char-	4 bytes -  65,536 characters - unicode
  
  
  Boolean
  
                       boolean - true  -1 bit
					             false
*/
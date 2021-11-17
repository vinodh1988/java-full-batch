class  Operators{
    public static void main(String n[]){
	   int a=30;
	   int b=50;
	   int c=60;
	   float m=43.35f;
	   float p=43.56f;
	   
	   System.out.println(a+b-c);
	   System.out.println(c+b*a); //1560
	   
	   System.out.println(a>=b);
	   System.out.println(a<b && a<c);
	   System.out.println(false && 50>30);
	   
	   System.out.println(++m);  //prefix
	   System.out.println(m);
	   System.out.println(p++);  //postfix
	    System.out.println(p);
		
	   int x1=90;
	   int x2=30;
	   
	   System.out.println(x1++==90 || x2++==30);
	   System.out.println(x1+"  "+x2);
	   
	   
	}
}
/*

   Operators three types
   
     unary operator - only one operand
	  
	  ex -   int a=-20;

      Binary operators  
	  
	  it needs two operands
	  
	  ex: a+b, a&&b
	  
	  Ternary operator
	  
	  a>b?x:y
	  
	  ------------------------------
	  Arithmetic operators   -   +,-,*,/,%
	  Relational Operators[ always result will be boolean]
	                 -    ==,<=,>=,!=,>,<
	  Logical Operators [Always result in boolean]
                     -   && , ||, !
	  incremental/decremental   - should be used for only numbers

                    ++ , --
       Bitwise operator  [ result will be number]
	               &, |  , ^, ~, >>, <<
				   
	  Assignment  - =
	  
	  Ternary - ? :
					
	
	      

*/
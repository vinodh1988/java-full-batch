class If{
     public static void main(String n[]){
         int age=18;
		 
		 if(age>=18)
			 System.out.println("Adult");
		 else
			 System.out.println("Juvenile");
		 
		 System.out.println(greatest(124,346,646));
		 int a=30;
		 int b=90;
		 int highest= a>b?a:b;
		 
		 System.out.println(highest);
	 
	 }
	 
	 public static int greatest(int a,int b,int c){
		 if(a>=b && a>=c)
			  return a;
		 else if(b>=a && b>=c)
			  return b;
		 else
			  return c;
		 
	 }
	 
	 

}

/*

Conditional Statements



*/